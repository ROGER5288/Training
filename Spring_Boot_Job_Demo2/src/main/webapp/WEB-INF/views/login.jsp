<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - Job Portal</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: white;
            padding: 40px;
            border-radius: 8px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 400px;
        }
        h2 {
            color: #2c3e50;
            margin-bottom: 30px;
            text-align: center;
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
        input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 14px;
        }
        input[type="email"]:focus, input[type="password"]:focus {
            outline: none;
            border-color: #667eea;
            box-shadow: 0 0 5px rgba(102, 126, 234, 0.3);
        }
        button {
            width: 100%;
            padding: 12px;
            background-color: #667eea;
            color: white;
            border: none;
            border-radius: 4px;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }
        button:hover {
            background-color: #5568d3;
        }
        .link {
            text-align: center;
            margin-top: 15px;
        }
        .link a {
            color: #667eea;
            text-decoration: none;
            font-weight: bold;
        }
        .link a:hover {
            color: #5568d3;
        }
        .error {
            color: red;
            margin-bottom: 15px;
            text-align: center;
            padding: 10px;
            background-color: #ffe6e6;
            border-radius: 4px;
        }
        .success {
            color: green;
            margin-bottom: 15px;
            text-align: center;
            padding: 10px;
            background-color: #e6ffe6;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        
        <% if (request.getParameter("error") != null) { %>
            <div class="error">Invalid email or password!</div>
        <% } %>
        
        <% if (request.getParameter("logout") != null) { %>
            <div class="success">Logged out successfully!</div>
        <% } %>
        
        <form method="post" action="/login">
            <div class="form-group">
                <label for="username">Email:</label>
                <input type="email" id="username" name="username" required>
            </div>
            
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
            </div>
            
            <button type="submit">Login</button>
        </form>
        
        <div class="link">
            New to Job Portal? <br>
            <a href="/employer/register-page">Register as Employer</a> | 
            <a href="/jobseeker/register-page">Register as Job Seeker</a>
        </div>
        
        <div class="link">
            <a href="/">Back to Home</a>
        </div>
    </div>
</body>
</html>
