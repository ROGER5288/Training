<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
<style>
	* {
		margin: 0;
		padding: 0;
		box-sizing: border-box;
	}
	
	body {
		font-family: Arial, sans-serif;
		background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
		min-height: 100vh;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	
	.welcome-container {
		background-color: white;
		padding: 60px 40px;
		border-radius: 10px;
		box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
		width: 100%;
		max-width: 500px;
		text-align: center;
	}
	
	h1 {
		color: #333;
		margin-bottom: 20px;
		font-size: 36px;
	}
	
	p {
		color: #666;
		font-size: 18px;
		margin-bottom: 30px;
	}
	
	.success-message {
		color: #27ae60;
		font-weight: bold;
		margin-bottom: 20px;
	}
	
	.button-group {
		display: flex;
		gap: 10px;
		justify-content: center;
	}
	
	button, a {
		padding: 10px 20px;
		border: none;
		border-radius: 5px;
		cursor: pointer;
		text-decoration: none;
		display: inline-block;
		font-size: 16px;
		font-weight: bold;
	}
	
	.btn-logout {
		background-color: #e74c3c;
		color: white;
	}
	
	.btn-logout:hover {
		background-color: #c0392b;
	}
	
	.btn-home {
		background-color: #3498db;
		color: white;
	}
	
	.btn-home:hover {
		background-color: #2980b9;
	}
</style>
</head>
<body>
	<div class="welcome-container">
		<h1>Welcome!</h1>
		<div class="success-message">
			<p>You have successfully logged in.</p>
		</div>
		<p>Hello, <strong>Admin</strong>. Welcome to the application.</p>
		<div class="button-group">
			<a href="/" class="btn-home">Go to Login</a>
			<form action="/logout" method="POST" style="display: inline;">
				<button type="submit" class="btn-logout">Logout</button>
			</form>
		</div>
	</div>
</body>
</html>
