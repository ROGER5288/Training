<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employer Dashboard - Job Portal</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }
        header {
            background-color: #2c3e50;
            color: white;
            padding: 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        header h1 {
            margin: 0;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin-left: 20px;
            font-weight: bold;
        }
        nav a:hover {
            color: #3498db;
        }
        .container {
            max-width: 1000px;
            margin: 30px auto;
            padding: 20px;
            background-color: white;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .dashboard-info {
            background-color: #ecf0f1;
            padding: 20px;
            border-radius: 5px;
            margin-bottom: 30px;
        }
        .dashboard-info h2 {
            color: #2c3e50;
            margin-bottom: 10px;
        }
        .dashboard-info p {
            color: #555;
        }
        .buttons {
            display: flex;
            gap: 15px;
            margin-bottom: 30px;
        }
        .btn {
            padding: 12px 30px;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
            display: inline-block;
            text-align: center;
            border: none;
            cursor: pointer;
            transition: 0.3s;
        }
        .btn-primary {
            background-color: #3498db;
            color: white;
        }
        .btn-primary:hover {
            background-color: #2980b9;
        }
        .btn-danger {
            background-color: #e74c3c;
            color: white;
        }
        .btn-danger:hover {
            background-color: #c0392b;
        }
        .btn-warning {
            background-color: #f39c12;
            color: white;
        }
        .btn-warning:hover {
            background-color: #d68910;
        }
        .logout {
            background-color: #e74c3c;
            color: white;
        }
        footer {
            background-color: #2c3e50;
            color: white;
            text-align: center;
            padding: 15px;
            margin-top: 40px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Job Portal - Employer Dashboard</h1>
        <nav>
            <a href="/employer/jobs">My Jobs</a>
            <a href="/employer/post-job-page">Post Job</a>
            <a href="/logout" class="logout">Logout</a>
        </nav>
    </header>
    
    <div class="container">
        <div class="dashboard-info">
            <h2>Welcome, ${employer.name}</h2>
            <p><strong>Company:</strong> ${employer.companyName}</p>
            <p><strong>Email:</strong> ${employer.email}</p>
        </div>
        
        <h3>Quick Actions</h3>
        <div class="buttons">
            <a href="/employer/jobs" class="btn btn-primary">View My Jobs</a>
            <a href="/employer/post-job-page" class="btn btn-primary">Post New Job</a>
            <a href="/" class="btn btn-warning">Browse</a>
        </div>
    </div>
    
    <footer>
        <p>&copy; 2024 Job Portal. All rights reserved.</p>
    </footer>
</body>
</html>
