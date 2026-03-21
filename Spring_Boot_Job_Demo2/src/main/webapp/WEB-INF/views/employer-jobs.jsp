<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Jobs - Job Portal</title>
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
        h2 {
            color: #2c3e50;
            margin-bottom: 20px;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
        }
        .btn-new {
            background-color: #27ae60;
            color: white;
            padding: 12px 30px;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
            display: inline-block;
            margin-bottom: 20px;
        }
        .btn-new:hover {
            background-color: #229954;
        }
        .job-card {
            background-color: white;
            padding: 20px;
            margin-bottom: 15px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .job-title {
            font-size: 20px;
            font-weight: bold;
            color: #2c3e50;
            margin-bottom: 10px;
        }
        .job-details {
            color: #666;
            margin-bottom: 10px;
        }
        .status {
            display: inline-block;
            padding: 5px 15px;
            border-radius: 20px;
            font-size: 12px;
            font-weight: bold;
        }
        .status.open {
            background-color: #27ae60;
            color: white;
        }
        .status.closed {
            background-color: #e74c3c;
            color: white;
        }
        .job-actions {
            margin-top: 15px;
            display: flex;
            gap: 10px;
        }
        .btn {
            padding: 8px 15px;
            text-decoration: none;
            border-radius: 4px;
            font-weight: bold;
            border: none;
            cursor: pointer;
            transition: 0.3s;
        }
        .btn-close {
            background-color: #f39c12;
            color: white;
        }
        .btn-close:hover {
            background-color: #d68910;
        }
        .btn-reopen {
            background-color: #16a085;
            color: white;
        }
        .btn-reopen:hover {
            background-color: #117a65;
        }
        .btn-delete {
            background-color: #e74c3c;
            color: white;
        }
        .btn-delete:hover {
            background-color: #c0392b;
        }
        .empty {
            background-color: white;
            padding: 40px;
            text-align: center;
            border-radius: 5px;
            color: #666;
        }
        .applicants-section {
            background-color: #ecf0f1;
            padding: 15px;
            margin-top: 15px;
            border-radius: 5px;
            border-left: 4px solid #3498db;
        }
        .applicants-title {
            font-weight: bold;
            color: #2c3e50;
            margin-bottom: 10px;
            font-size: 14px;
        }
        .applicant-item {
            background-color: white;
            padding: 10px 12px;
            margin-bottom: 8px;
            border-radius: 4px;
            border-left: 3px solid #3498db;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .applicant-info {
            font-size: 13px;
            color: #333;
            flex: 1;
        }
        .applicant-name {
            font-weight: bold;
            color: #2c3e50;
        }
        .applicant-email {
            color: #7f8c8d;
            font-size: 12px;
        }
        .applicant-actions {
            display: flex;
            gap: 6px;
            align-items: center;
            margin-left: 10px;
        }
        .applicant-status {
            padding: 4px 10px;
            border-radius: 12px;
            font-size: 11px;
            font-weight: bold;
            white-space: nowrap;
        }
        .status-applied {
            background-color: #e8f4f8;
            color: #16a085;
        }
        .status-accepted {
            background-color: #d5f4e6;
            color: #27ae60;
        }
        .status-rejected {
            background-color: #fadbd8;
            color: #c0392b;
        }
        .no-applicants {
            font-size: 12px;
            color: #95a5a6;
            font-style: italic;
        }
        .btn-accept {
            background-color: #27ae60;
            color: white;
            padding: 4px 10px;
            border: none;
            border-radius: 4px;
            font-size: 11px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }
        .btn-accept:hover {
            background-color: #229954;
        }
        .btn-reject {
            background-color: #e74c3c;
            color: white;
            padding: 4px 10px;
            border: none;
            border-radius: 4px;
            font-size: 11px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }
        .btn-reject:hover {
            background-color: #c0392b;
        }
    </style>
</head>
<body>
    <header>
        <h1>My Jobs</h1>
        <nav>
            <a href="/employer/post-job-page">Post New Job</a>
            <a href="/employer/dashboard">Dashboard</a>
            <a href="/logout">Logout</a>
        </nav>
    </header>
    
    <div class="container">
        <c:if test="${empty jobs}">
            <div class="empty">
                <p>You haven't posted any jobs yet.</p>
                <a href="/employer/post-job-page" class="btn-new">Post Your First Job</a>
            </div>
        </c:if>
        
        <c:if test="${not empty jobs}">
            <h2>Your Job Postings (${jobs.size()} jobs)</h2>
            <a href="/employer/post-job-page" class="btn-new">+ Post New Job</a>
            
            <c:forEach items="${jobs}" var="job">
                <div class="job-card">
                    <div class="job-title">${job.title}</div>
                    <div class="job-details">
                        <div><strong>Location:</strong> ${job.location}</div>
                        <div><strong>Salary:</strong> ₹${job.salary}</div>
                        <div><strong>Status:</strong> <span class="status ${job.status.toString().toLowerCase()}">${job.status}</span></div>
                    </div>
                    <div class="job-details">${job.description}</div>
                    
                    <!-- Applicants Section -->
                    <div class="applicants-section">
                        <div class="applicants-title">Applied Candidates (${jobApplications[job.id].size()})</div>
                        <c:if test="${empty jobApplications[job.id]}">
                            <div class="no-applicants">No applications yet</div>
                        </c:if>
                        <c:if test="${not empty jobApplications[job.id]}">
                            <c:forEach items="${jobApplications[job.id]}" var="app">
                                <div class="applicant-item">
                                    <div class="applicant-info">
                                        <div class="applicant-name">${app.jobSeeker.name}</div>
                                        <div class="applicant-email">${app.jobSeeker.email}</div>
                                        <div style="font-size: 11px; color: #95a5a6; margin-top: 3px;">Applied on: ${app.appliedDate}</div>
                                    </div>
                                    <div class="applicant-actions">
                                        <span class="applicant-status status-${app.status.toString().toLowerCase()}">${app.status}</span>
                                        <c:if test="${app.status.toString() == 'APPLIED'}">
                                            <form method="post" action="/employer/accept-application/${app.id}" style="display:inline;">
                                                <button type="submit" class="btn-accept">Accept</button>
                                            </form>
                                            <form method="post" action="/employer/reject-application/${app.id}" style="display:inline;">
                                                <button type="submit" class="btn-reject">Reject</button>
                                            </form>
                                        </c:if>
                                    </div>
                                </div>
                            </c:forEach>
                        </c:if>
                    </div>
                    
                    <div class="job-actions">
                        <c:if test="${job.status.toString() == 'OPEN'}">
                            <form method="post" action="/employer/close-job/${job.id}" style="display:inline;">
                                <button type="submit" class="btn btn-close">Close Job</button>
                            </form>
                        </c:if>
                        <c:if test="${job.status.toString() == 'CLOSED'}">
                            <form method="post" action="/employer/reopen-job/${job.id}" style="display:inline;">
                                <button type="submit" class="btn btn-reopen">Reopen Job</button>
                            </form>
                        </c:if>
                        <form method="post" action="/employer/delete-job/${job.id}" style="display:inline;">
                            <button type="submit" class="btn btn-delete" onclick="return confirm('Are you sure?');">Delete Job</button>
                        </form>
                    </div>
                </div>
            </c:forEach>
        </c:if>
    </div>
</body>
</html>
