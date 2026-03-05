package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.stream.Collectors;

public class UserDAO {
    // Declare EntityManagerFactory field for managing JPA persistence unit
    private final EntityManagerFactory ef;
    // Declare EntityManager field for performing database operations
    private final EntityManager em;

    // Constructor initializes the DAO with EntityManagerFactory and EntityManager
    public UserDAO() {
        // Create EntityManagerFactory from persistence unit configuration
        this.ef = Persistence.createEntityManagerFactory("UserPU");
        // Create EntityManager instance from the factory
        this.em = ef.createEntityManager();
    }

    // Method to persist a new User entity and return it as a DTO
    public UserDTO create(User user) {
        try {
            // Start a database transaction
            em.getTransaction().begin();
            // Add the user object to the persistence context
            em.persist(user);
            // Commit the transaction to save changes to database
            em.getTransaction().commit();
            // Convert and return the user as a DTO
            return convertToDTO(user);
        } catch (Exception e) {
            // Check if transaction is still active
            if (em.getTransaction().isActive())
                // Rollback transaction on error
                em.getTransaction().rollback();
            // Wrap and throw exception
            throw new RuntimeException(e);
        }
    }

    // Method to retrieve a User by ID and return it as a DTO
    public UserDTO getUserById(long id) {
        // Query database for User with given ID
        User user = em.find(User.class, id);
        // Return DTO if found, otherwise return null
        return user != null ? convertToDTO(user) : null;
    }

    // Method to retrieve all Users from database and return as list of DTOs
    public List<UserDTO> findAll() {
        // Execute JPQL query to get all User entities
        List<User> users = em.createQuery("FROM User", User.class)
                .getResultList();

        // Convert each User to DTO using stream and collector
        return users.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Method to update an existing User by ID and return updated DTO
    public UserDTO updateUser(long id, String newName, String newEmail) {
        try {
            // Start a database transaction
            em.getTransaction().begin();

            // Retrieve User entity by ID from database
            User user = em.find(User.class, id);
            // Check if User exists
            if (user == null)
                // Return null if User not found
                return null;

            // Update user name field
            user.setName(newName);
            // Update user email field
            user.setEmail(newEmail);

            // Commit transaction to persist changes
            em.getTransaction().commit();
            // Convert and return updated user as DTO
            return convertToDTO(user);

        } catch (Exception e) {
            // Check if transaction is still active
            if (em.getTransaction().isActive())
                // Rollback transaction on error
                em.getTransaction().rollback();
            // Wrap and throw exception
            throw new RuntimeException(e);
        }
    }

    // Method to delete a User by ID and return success status
    public boolean deleteUser(long id) {
        try {
            // Start a database transaction
            em.getTransaction().begin();

            // Retrieve User entity by ID from database
            User user = em.find(User.class, id);
            // Check if User exists
            if (user == null)
                // Return false if User not found
                return false;

            // Remove user from persistence context and database
            em.remove(user);
            // Commit transaction to persist deletion
            em.getTransaction().commit();
            // Return true indicating successful deletion
            return true;

        } catch (Exception e) {
            // Check if transaction is still active
            if (em.getTransaction().isActive())
                // Rollback transaction on error
                em.getTransaction().rollback();
            // Wrap and throw exception
            throw new RuntimeException(e);
        }
    }

    // Helper method to convert User entity to UserDTO
    private UserDTO convertToDTO(User user) {
        // Create new UserDTO with user fields
        return new UserDTO(
                // Set DTO userId from user
                user.getUserId(),
                // Set DTO name from user
                user.getName(),
                // Set DTO email from user
                user.getEmail()
        );
    }

    // Method to close EntityManager and EntityManagerFactory resources
    public void close() {
        // Check if EntityManager is open
        if (em.isOpen())
            // Close EntityManager
            em.close();

        // Check if EntityManagerFactory is open
        if (ef.isOpen())
            // Close EntityManagerFactory
            ef.close();
    }
}
