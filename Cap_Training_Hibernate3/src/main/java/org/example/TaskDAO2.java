package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TaskDAO2 {
    private final EntityManagerFactory ef;
    private final EntityManager em;

    public TaskDAO2() {
        this.ef = Persistence.createEntityManagerFactory("UserPU");
        this.em = ef.createEntityManager();
    }

    /**
     * Create a task for a specific user.
     * Only the user creating the task can perform CRUD operations on it.
     * @param userId The ID of the user creating the task
     * @param task The task object to be created
     * @return TaskDTO if successful, null otherwise
     */
    public TaskDTO create(Long userId, Task task){
        try{
            User user = em.find(User.class, userId);
            if(user == null){
                System.out.println("User not found with id: " + userId);
                return null;
            }

            // Associate the task with the user who is creating it
            task.setUser(user);

            // Begin transaction
            em.getTransaction().begin();
            // Persist the task
            em.persist(task);
            // Commit transaction
            em.getTransaction().commit();

            System.out.println("Task created successfully by user: " + userId);
            return convertToDTO(task);

        } catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw new RuntimeException(e);
        }
    }

    /**
     * Get a task by ID, checking if the requesting user is the task owner.
     * @param taskId The ID of the task to retrieve
     * @param userId The ID of the user requesting the task
     * @return TaskDTO if user is authorized and task exists, null otherwise
     */
    public TaskDTO getTaskById(Long taskId, Long userId){
        try{
            Task task = em.find(Task.class, taskId);
            if(task == null){
                System.out.println("Task not found with id: " + taskId);
                return null;
            }

            // Check if the requesting user is the owner of this task
            if(!isTaskOwner(task, userId)){
                System.out.println("Unauthorized: User " + userId + " is not the owner of task " + taskId);
                return null;
            }

            return convertToDTO(task);

        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    /**
     * Update a task, checking if the requesting user is the task owner.
     * @param taskId The ID of the task to update
     * @param userId The ID of the user requesting the update
     * @param newTask The new task name
     * @param newDescription The new task description
     * @return Updated TaskDTO if successful, null otherwise
     */
    public TaskDTO updateTask(Long taskId, Long userId, String newTask, String newDescription){
        try{
            Task task = em.find(Task.class, taskId);
            if(task == null){
                System.out.println("Task not found with id: " + taskId);
                return null;
            }

            // Check if the requesting user is the owner of this task
            if(!isTaskOwner(task, userId)){
                System.out.println("Unauthorized: User " + userId + " cannot update task " + taskId);
                return null;
            }

            // Begin transaction
            em.getTransaction().begin();
            // Update task fields
            task.setTask(newTask);
            task.setDescription(newDescription);
            // Commit transaction
            em.getTransaction().commit();

            System.out.println("Task updated successfully by user: " + userId);
            return convertToDTO(task);

        } catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw new RuntimeException(e);
        }
    }

    /**
     * Delete a task, checking if the requesting user is the task owner.
     * @param taskId The ID of the task to delete
     * @param userId The ID of the user requesting the deletion
     * @return true if deletion was successful, false otherwise
     */
    public boolean deleteTask(Long taskId, Long userId){
        try{
            Task task = em.find(Task.class, taskId);
            if(task == null){
                System.out.println("Task not found with id: " + taskId);
                return false;
            }

            // Check if the requesting user is the owner of this task
            if(!isTaskOwner(task, userId)){
                System.out.println("Unauthorized: User " + userId + " cannot delete task " + taskId);
                return false;
            }

            // Begin transaction
            em.getTransaction().begin();
            // Remove the task
            em.remove(task);
            // Commit transaction
            em.getTransaction().commit();

            System.out.println("Task deleted successfully by user: " + userId);
            return true;

        } catch(Exception e){
            if(em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            throw new RuntimeException(e);
        }
    }

    /**
     * Helper method to check if a user is the owner of a task.
     * @param task The task to check ownership for
     * @param userId The ID of the user to verify
     * @return true if the user is the task owner, false otherwise
     */
    private boolean isTaskOwner(Task task, Long userId){
        return task.getUser() != null && task.getUser().getUserId() == userId;
    }

    /**
     * Helper method to convert Task entity to TaskDTO.
     * @param task The task entity to convert
     * @return TaskDTO representation of the task
     */
    private TaskDTO convertToDTO(Task task){
        return new TaskDTO(
            task.getId(),
            task.getTask(),
            task.getDescription(),
            task.getUser()
        );
    }

    /**
     * Close resources: EntityManager and EntityManagerFactory.
     */
    public void close(){
        if(em.isOpen()){
            em.close();
        }
        if(ef.isOpen()){
            ef.close();
        }
    }
}
