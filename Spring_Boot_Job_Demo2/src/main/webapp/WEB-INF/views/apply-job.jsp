<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Apply for Job - Job Portal</title>
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
            text-align: center;
        }
        .container {
            max-width: 700px;
            margin: 30px auto;
            padding: 30px;
            background-color: white;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h2 {
            color: #2c3e50;
            margin-bottom: 10px;
        }
        .job-info {
            background-color: #ecf0f1;
            padding: 20px;
            border-radius: 5px;
            margin-bottom: 20px;
        }
        .job-info div {
            margin-bottom: 10px;
        }
        .job-title {
            font-size: 20px;
            font-weight: bold;
            color: #2c3e50;
        }
        .job-detail {
            color: #555;
        }
        .company {
            color: #7f8c8d;
            font-style: italic;
        }
        .description {
            line-height: 1.6;
            color: #333;
            White-space: pre-wrap;
            margin-top: 10px;
        }
        .status {
            display: inline-block;
            padding: 5px 15px;
            background-color: #27ae60;
            color: white;
            border-radius: 3px;
            font-size: 12px;
            font-weight: bold;
        }
        .status.closed {
            background-color: #e74c3c;
        }
        .form-section {
            margin-top: 30px;
            padding-top: 20px;
            border-top: 2px solid #ddd;
        }
        .form-section h3 {
            color: #2c3e50;
            margin-bottom: 15px;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
            font-weight: bold;
        }
        textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 14px;
            font-family: Arial, sans-serif;
            resize: vertical;
            min-height: 80px;
        }
        textarea:focus {
            outline: none;
            border-color: #27ae60;
            box-shadow: 0 0 5px rgba(39, 174, 96, 0.3);
        }
        .buttons {
            display: flex;
            gap: 10px;
            margin-top: 20px;
        }
        button, a {
            flex: 1;
            padding: 12px;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
            text-align: center;
            text-decoration: none;
        }
        .btn-apply {
            background-color: #27ae60;
            color: white;
        }
        .btn-apply:hover {
            background-color: #229954;
        }
        .btn-cancel {
            background-color: #95a5a6;
            color: white;
        }
        .btn-cancel:hover {
            background-color: #7f8c8d;
        }
        .error {
            color: red;
            margin-bottom: 15px;
        }
        .info {
            background-color: #e8f8f5;
            color: #0b5345;
            padding: 15px;
            border-radius: 4px;
            margin-bottom: 20px;
            border-left: 4px solid #27ae60;
        }
        .warning {
            background-color: #fdeee8;
            color: #7b2d1f;
            padding: 15px;
            border-radius: 4px;
            margin-bottom: 20px;
            border-left: 4px solid #e74c3c;
        }
    </style>
</head>
<body>
    <header>
        <h1>Apply for Job</h1>
    </header>
    
    <div class="container">
        <% if (request.getAttribute("error") != null) { %>
            <div class="error"><%= request.getAttribute("error") %></div>
        <% } %>
        
        <h2>Job Details</h2>
        <div class="job-info">
            <div class="job-title">${job.title}</div>
            <div class="company">${job.employer.companyName}</div>
            <div class="job-detail" style="margin-top: 10px;">
                <strong>Location:</strong> ${job.location}
            </div>
            <div class="job-detail">
                <strong>Salary:</strong> ₹${job.salary}
            </div>
            <div class="job-detail">
                <strong>Status:</strong> <span class="status ${job.status.toString().toLowerCase()}">${job.status}</span>
            </div>
            <div class="description">
                <strong>Description:</strong><br>
                ${job.description}
            </div>
        </div>
        
        <% if ("OPEN".equals(String.valueOf(request.getAttribute("job") != null ? ((com.capgemini.training.entity.JobEntity) request.getAttribute("job")).getStatus() : ""))){%>
        
        <c:if test="${hasApplied}">
            <div class="warning">
                <strong>Already Applied!</strong> You have already applied for this job. Please wait for the employer's response. You can apply again only after the employer rejects your application.
            </div>
            <div class="buttons">
                <a href="/jobseeker/dashboard" class="btn-cancel">Go to Dashboard</a>
            </div>
        </c:if>
        
        <c:if test="${!hasApplied}">
            <div class="info">
                <strong>Ready to apply?</strong> Confirm your application to this exciting opportunity.
            </div>
            
            <form method="post" action="/jobseeker/apply/${job.id}">
                <div class="buttons">
                    <button type="submit" class="btn-apply">Confirm Application</button>
                    <a href="/jobseeker/jobs" class="btn-cancel">Cancel</a>
                </div>
            </form>
        </c:if>
        
        <% } else { %>
        <div class="error">
            <strong>This job is no longer open.</strong> Please browse other available jobs.
        </div>
        <div class="buttons">
            <a href="/jobseeker/jobs" class="btn-cancel">Back to Jobs</a>
        </div>
        <% } %>
    </div>
</body>
</html>
