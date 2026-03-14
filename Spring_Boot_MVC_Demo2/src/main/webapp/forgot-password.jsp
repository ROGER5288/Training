<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
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
		padding: 20px;
	}
	
	.forgot-password-container {
		background-color: white;
		padding: 40px;
		border-radius: 10px;
		box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
		width: 100%;
		max-width: 420px;
	}
	
	h1 {
		text-align: center;
		color: #333;
		margin-bottom: 15px;
		font-size: 28px;
	}
	
	.description {
		text-align: center;
		color: #666;
		font-size: 14px;
		margin-bottom: 30px;
		line-height: 1.6;
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
	
	input[type="email"],
	input[type="text"] {
		width: 100%;
		padding: 12px;
		border: 1px solid #ddd;
		border-radius: 5px;
		font-size: 14px;
		transition: border-color 0.3s;
		box-sizing: border-box;
	}
	
	input[type="email"]:focus,
	input[type="text"]:focus {
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
		margin-top: 10px;
	}
	
	.form-group button:hover {
		transform: translateY(-2px);
		box-shadow: 0 5px 15px rgba(102, 126, 234, 0.4);
	}
	
	.form-group button:active {
		transform: translateY(0);
	}
	
	.help-text {
		background-color: #f0f4ff;
		padding: 12px;
		border-radius: 5px;
		font-size: 13px;
		color: #555;
		margin-bottom: 20px;
		line-height: 1.6;
	}
	
	.help-text strong {
		color: #667eea;
	}
	
	.divider {
		text-align: center;
		margin: 20px 0;
		color: #999;
	}
	
	.divider::before,
	.divider::after {
		content: '';
		display: inline-block;
		width: 45%;
		height: 1px;
		background-color: #ddd;
		vertical-align: middle;
	}
	
	.divider::before {
		margin-right: 10px;
	}
	
	.divider::after {
		margin-left: 10px;
	}
	
	.button-group {
		display: flex;
		gap: 10px;
		justify-content: space-between;
	}
	
	.button-group a,
	.button-group button {
		flex: 1;
		padding: 10px;
		text-align: center;
		text-decoration: none;
		border-radius: 5px;
		border: none;
		font-weight: bold;
		cursor: pointer;
		transition: all 0.2s;
	}
	
	.btn-primary {
		background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
		color: white;
	}
	
	.btn-primary:hover {
		transform: translateY(-2px);
		box-shadow: 0 5px 15px rgba(102, 126, 234, 0.4);
	}
	
	.btn-secondary {
		background-color: #e8e8e8;
		color: #333;
	}
	
	.btn-secondary:hover {
		background-color: #d5d5d5;
	}
	
	.security-note {
		background-color: #fffbea;
		padding: 12px;
		border-left: 4px solid #f39c12;
		border-radius: 3px;
		font-size: 12px;
		color: #7d6608;
		margin-top: 20px;
		line-height: 1.6;
	}
	
	.security-note strong {
		color: #d68910;
	}
</style>
</head>
<body>

	<div class="forgot-password-container">
		<h1>Forgot Password?</h1>
		<p class="description">
			No worries! Enter your email address below, and we'll send you instructions to reset your password.
		</p>
		
		<div class="help-text">
			<strong>How it works:</strong> We'll verify your email address and send you a secure link to reset your password. The link will expire in 24 hours for security purposes.
		</div>
		
		<form action="/forgot-password" method="post">
			<div class="form-group">
				<label for="email">Email Address</label>
				<input type="email" id="email" name="email" placeholder="Enter your registered email" required>
			</div>
			
			<div class="form-group">
				<button type="submit">Send Reset Link</button>
			</div>
		</form>
		
		<div class="divider">or</div>
		
		<div class="button-group">
			<a href="/" class="btn-secondary">Back to Login</a>
			<a href="/signup" class="btn-primary">Create Account</a>
		</div>
		
		<div class="security-note">
			<strong>Security Note:</strong> Never share your password with anyone. Our support team will never ask you for your password via email or phone.
		</div>
	</div>

</body>
</html>
