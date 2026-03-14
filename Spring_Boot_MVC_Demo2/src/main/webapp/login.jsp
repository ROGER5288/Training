<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
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
	
	.login-container {
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
	input[type="password"] {
		width: 100%;
		padding: 12px;
		border: 1px solid #ddd;
		border-radius: 5px;
		font-size: 14px;
		transition: border-color 0.3s;
	}
	
	input[type="text"]:focus,
	input[type="password"]:focus {
		outline: none;
		border-color: #667eea;
		box-shadow: 0 0 5px rgba(102, 126, 234, 0.3);
	}
	
	.form-group button {
		width: 100%;
		padding: 12px;
		background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
		color: white;
		border: none;
		border-radius: 5px;
		font-size: 16px;
		font-weight: bold;
		cursor: pointer;
		transition: transform 0.2s, box-shadow 0.2s;
	}
	
	.form-group button:hover {
		transform: translateY(-2px);
		box-shadow: 0 5px 15px rgba(102, 126, 234, 0.4);
	}
	
	.form-group button:active {
		transform: translateY(0);
	}
	
	.remember-forgot {
		display: flex;
		justify-content: space-between;
		margin-bottom: 20px;
		font-size: 14px;
	}
	
	.remember-forgot a {
		color: #667eea;
		text-decoration: none;
	}
	
	.remember-forgot a:hover {
		text-decoration: underline;
	}
	
	.signup-link {
		text-align: center;
		margin-top: 15px;
		color: #666;
		font-size: 14px;
	}
	
	.signup-link a {
		color: #667eea;
		text-decoration: none;
		font-weight: bold;
	}
	
	.signup-link a:hover {
		text-decoration: underline;
	}
</style>
</head>
<body>

	<div class="login-container">
		<h1>Login</h1>
		<form action="login" method="post">
			<div class="form-group">
				<label for="username">Username</label>
				<input type="text" id="username" name="username" placeholder="Enter your username" required>
			</div>
			
			<div class="form-group">
				<label for="password">Password</label>
				<input type="password" id="password" name="password" placeholder="Enter your password" required>
			</div>
			
			<div class="remember-forgot">
				<label>
					<input type="checkbox" name="remember"> Remember me
				</label>
				<a href="/forgot-password">Forgot password?</a>
			</div>
			
			<div class="form-group">
				<button type="submit">Login</button>
			</div>
		</form>
		
		<div class="signup-link">
			Don't have an account? <a href="/signup">Sign up here</a>
		</div>
	</div>

</body>
</html>