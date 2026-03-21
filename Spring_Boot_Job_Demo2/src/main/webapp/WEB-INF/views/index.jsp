<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Job Portal - Home</title>
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
        nav {
            background-color: #34495e;
            padding: 10px;
            text-align: center;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
            font-weight: bold;
        }
        nav a:hover {
            color: #3498db;
        }
        .container {
            max-width: 1200px;
            margin: 30px auto;
            padding: 20px;
            background-color: white;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .intro {
            text-align: center;
            margin-bottom: 40px;
        }
        .intro h2 {
            color: #2c3e50;
            margin-bottom: 10px;
        }
        .intro p {
            color: #666;
            line-height: 1.6;
        }
        .buttons {
            display: flex;
            justify-content: center;
            gap: 20px;
            flex-wrap: wrap;
        }
        .btn {
            padding: 12px 30px;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
            display: inline-block;
            transition: 0.3s;
        }
        .btn-employer {
            background-color: #3498db;
            color: white;
        }
        .btn-employer:hover {
            background-color: #2980b9;
        }
        .btn-jobseeker {
            background-color: #27ae60;
            color: white;
        }
        .btn-jobseeker:hover {
            background-color: #229954;
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
        <h1>🚀 Job Portal</h1>
        <p>Connect Employers with Job Seekers</p>
    </header>
    
    <nav>
        <a href="/">Home</a>
        <a href="/employer/login-page">Employer Login</a>
        <a href="/jobseeker/login-page">Job Seeker Login</a>
    </nav>
    
    <div class="container">
        <div class="intro">
            <h2>Welcome to Job Portal</h2>
            <p>Find your dream job or hire talented professionals. Our platform makes it easy to connect employers with job seekers.</p>
        </div>
        
        <div class="buttons">
            <a href="/employer/login-page" class="btn btn-employer">Employer Login</a>
            <a href="/employer/register-page" class="btn btn-employer">Employer Register</a>
            <a href="/jobseeker/login-page" class="btn btn-jobseeker">Job Seeker Login</a>
            <a href="/jobseeker/register-page" class="btn btn-jobseeker">Job Seeker Register</a>
            <a href="/jobseeker/jobs" class="btn btn-jobseeker">Browse Jobs</a>
        </div>
    </div>
    
    <footer>
        <p>&copy; 2024 Job Portal. All rights reserved.</p>
    </footer>
</body>
</html>
