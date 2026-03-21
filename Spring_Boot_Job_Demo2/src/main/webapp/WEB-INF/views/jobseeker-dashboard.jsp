<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Job Seeker Dashboard - Job Portal</title>
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
        nav a {
            color: white;
            text-decoration: none;
            margin-left: 20px;
            font-weight: bold;
        }
        nav a:hover {
            color: #27ae60;
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
            background-color: #27ae60;
            color: white;
            transition: 0.3s;
        }
        .btn:hover {
            background-color: #229954;
        }
        h3 {
            color: #2c3e50;
            margin-top: 30px;
            margin-bottom: 15px;
            border-bottom: 2px solid #27ae60;
            padding-bottom: 10px;
        }
        .application-card {
            background-color: #f9f9f9;
            padding: 15px;
            margin-bottom: 15px;
            border-left: 4px solid #27ae60;
            border-radius: 3px;
        }
        .app-title {
            font-weight: bold;
            color: #2c3e50;
            margin-bottom: 5px;
        }
        .app-details {
            color: #666;
            font-size: 14px;
        }
        .status {
            display: inline-block;
            padding: 3px 10px;
            border-radius: 3px;
            font-size: 12px;
            font-weight: bold;
            margin-top: 5px;
        }
        .status.applied {
            background-color: #3498db;
            color: white;
        }
        .status.accepted {
            background-color: #27ae60;
            color: white;
        }
        .status.rejected {
            background-color: #e74c3c;
            color: white;
        }
        .empty {
            background-color: #ecf0f1;
            padding: 30px;
            text-align: center;
            border-radius: 5px;
            color: #666;
        }
    </style>
</head>
<body>
    <header>
        <h1>Job Portal - Job Seeker Dashboard</h1>
        <nav>
            <a href="/jobseeker/jobs">Browse Jobs</a>
            <a href="/jobseeker/dashboard">My Applications</a>
            <a href="/logout">Logout</a>
        </nav>
    </header>
    
    <div class="container">
        <div class="dashboard-info">
            <h2>Welcome, ${jobSeeker.name}</h2>
            <p><strong>Email:</strong> ${jobSeeker.email}</p>
            <p><strong>Skills:</strong> ${jobSeeker.skills}</p>
        </div>
        
        <div class="buttons">
            <a href="/jobseeker/jobs" class="btn">Browse Jobs</a>
            <a href="/" class="btn">Home</a>
        </div>
        
        <h3>My Applications</h3>
        
        <c:if test="${empty applications}">
            <div class="empty">
                <p>You haven't applied for any jobs yet.</p>
                <a href="/jobseeker/jobs" class="btn">Browse Jobs</a>
            </div>
        </c:if>
        
        <c:if test="${not empty applications}">
            <c:forEach items="${applications}" var="app">
                <div class="application-card">
                    <div class="app-title">${app.job.title}</div>
                    <div class="app-details">
                        <div><strong>Company:</strong> ${app.job.employer.companyName}</div>
                        <div><strong>Location:</strong> ${app.job.location}</div>
                        <div><strong>Salary:</strong> ₹${app.job.salary}</div>
                        <div><strong>Applied:</strong> ${app.appliedDate}</div>
                        <span class="status ${app.status.toString().toLowerCase()}">${app.status}</span>
                    </div>
                </div>
            </c:forEach>
        </c:if>
    </div>
</body>
</html>
