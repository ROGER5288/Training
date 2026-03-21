<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Browse Jobs - Job Portal</title>
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
        .container {
            max-width: 1000px;
            margin: 30px auto;
            padding: 20px;
        }
        .search-section {
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            margin-bottom: 20px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .search-form {
            display: flex;
            gap: 10px;
            flex-wrap: wrap;
        }
        input[type="text"] {
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            flex: 1;
            min-width: 200px;
        }
        button {
            padding: 10px 20px;
            background-color: #3498db;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-weight: bold;
        }
        button:hover {
            background-color: #2980b9;
        }
        h2 {
            color: #2c3e50;
            margin-bottom: 20px;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
        }
        .job-card {
            background-color: white;
            padding: 20px;
            margin-bottom: 15px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .job-info {
            flex: 1;
        }
        .job-title {
            font-size: 18px;
            font-weight: bold;
            color: #2c3e50;
            margin-bottom: 8px;
        }
        .job-company {
            font-size: 14px;
            color: #7f8c8d;
            margin-bottom: 8px;
        }
        .job-details {
            font-size: 13px;
            color: #666;
            margin-bottom: 5px;
        }
        .status {
            display: inline-block;
            padding: 5px 10px;
            background-color: #27ae60;
            color: white;
            border-radius: 3px;
            font-size: 12px;
            font-weight: bold;
        }
        .status.closed {
            background-color: #e74c3c;
        }
        .btn-apply {
            padding: 10px 20px;
            background-color: #27ae60;
            color: white;
            text-decoration: none;
            border-radius: 4px;
            font-weight: bold;
            display: inline-block;
            transition: 0.3s;
        }
        .btn-apply:hover {
            background-color: #229954;
        }
        .btn-apply.disabled {
            background-color: #95a5a6;
            cursor: not-allowed;
        }
        .empty {
            background-color: white;
            padding: 40px;
            text-align: center;
            border-radius: 5px;
            color: #666;
        }
        .btn-back {
            background-color: #95a5a6;
            color: white;
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 4px;
            display: inline-block;
            margin-bottom: 20px;
            font-weight: bold;
        }
        .btn-back:hover {
            background-color: #7f8c8d;
        }
    </style>
</head>
<body>
    <header>
        <h1>Browse Jobs</h1>
        <nav>
            <a href="/jobseeker/dashboard">My Dashboard</a>
            <a href="/logout">Logout</a>
        </nav>
    </header>
    
    <div class="container">
        <a href="/jobseeker/dashboard" class="btn-back">← Back to Dashboard</a>
        
        <div class="search-section">
            <h3>Search Jobs</h3>
            <div class="search-form">
                <form method="get" action="/jobseeker/jobs" style="display: flex; gap: 10px; width: 100%;">
                    <input type="text" name="search" placeholder="Search by job title..." value="${param.search}">
                    <button type="submit">Search</button>
                </form>
            </div>
        </div>
        
        <h2>Available Jobs (${jobs.size()} jobs found)</h2>
        
        <c:if test="${empty jobs}">
            <div class="empty">
                <p>No jobs available at the moment.</p>
            </div>
        </c:if>
        
        <c:if test="${not empty jobs}">
            <c:forEach items="${jobs}" var="job">
                <div class="job-card">
                    <div class="job-info">
                        <div class="job-title">${job.title}</div>
                        <div class="job-company">${job.employer.companyName}</div>
                        <div class="job-details"><strong>Location:</strong> ${job.location}</div>
                        <div class="job-details"><strong>Salary:</strong> ₹${job.salary}</div>
                        <div class="job-details">${job.description}</div>
                        <span class="status ${job.status.toString().toLowerCase()}">${job.status}</span>
                    </div>
                    <div>
                        <c:if test="${job.status.toString() == 'OPEN'}">
                            <a href="/jobseeker/apply-page/${job.id}" class="btn-apply">Apply</a>
                        </c:if>
                        <c:if test="${job.status.toString() != 'OPEN'}">
                            <span class="btn-apply disabled">Closed</span>
                        </c:if>
                    </div>
                </div>
            </c:forEach>
        </c:if>
    </div>
</body>
</html>
