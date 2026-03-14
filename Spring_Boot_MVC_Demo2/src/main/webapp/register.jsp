<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
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
	
	.register-container {
		background-color: white;
		padding: 40px;
		border-radius: 10px;
		box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
		width: 100%;
		max-width: 400px;
	}
	
	h1 {
		text-align: center;
		color: #333;
		margin-bottom: 30px;
		font-size: 28px;
	}
	
	.form-group {
		margin-bottom: 20px;
	}
	
	label {
		display: block;
		margin-bottom: 8px;
		color: #555;
		font-weight: bold;
	}
	
	input[type="text"],
	input[type="email"],
	input[type="password"] {
		width: 100%;
		padding: 10px;
		border: 1px solid #ddd;
		border-radius: 5px;
		font-size: 14px;
		box-sizing: border-box;
	}
	
	input[type="text"]:focus,
	input[type="email"]:focus,
	input[type="password"]:focus {
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
		border-radius: 5px;
		font-size: 16px;
		font-weight: bold;
		cursor: pointer;
		transition: background-color 0.3s ease;
	}
	
	button:hover {
		background-color: #764ba2;
	}
	
	.register-link {
		text-align: center;
		margin-top: 20px;
	}
	
	.register-link a {
		color: #667eea;
		text-decoration: none;
		font-weight: bold;
	}
	
	.register-link a:hover {
		text-decoration: underline;
	}
</style>
</head>
<body>
	<div class="register-container">
		<h1>Register</h1>
		<form action="/register" method="POST">
			<div class="form-group">
				<label for="username">Username:</label>
				<input type="text" id="username" name="username" required>
			</div>
			<div class="form-group">
				<label for="email">Email:</label>
				<input type="email" id="email" name="email" required>
			</div>
			<div class="form-group">
				<label for="password">Password:</label>
				<input type="password" id="password" name="password" required>
			</div>
			<div class="form-group">
				<label for="confirm-password">Confirm Password:</label>
				<input type="password" id="confirm-password" name="confirm-password" required>
			</div>
			<button type="submit">Register</button>
		</form>
		<div class="register-link">
			<p>Already have an account? <a href="/">Login here</a></p>
		</div>
	</div>
</body>
</html>
