<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - SpringBoot Dynamic Web Application</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            line-height: 1.6;
            color: #333;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
        }

        header {
            background-color: rgba(0, 0, 0, 0.85);
            color: white;
            padding: 1rem 0;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.3);
            position: sticky;
            top: 0;
            z-index: 100;
        }

        nav {
            max-width: 1200px;
            margin: 0 auto;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0 2rem;
        }

        .logo {
            font-size: 1.8rem;
            font-weight: bold;
            color: #667eea;
            text-decoration: none;
        }

        nav ul {
            list-style: none;
            display: flex;
            gap: 2rem;
        }

        nav a {
            color: white;
            text-decoration: none;
            transition: color 0.3s ease;
            font-weight: 500;
        }

        nav a:hover {
            color: #667eea;
        }

        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 2rem;
        }

        .hero {
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: calc(100vh - 80px);
            color: white;
            text-align: center;
        }

        .hero-content h1 {
            font-size: 3.5rem;
            margin-bottom: 1rem;
            animation: slideInDown 0.8s ease-out;
        }

        .hero-content .subtitle {
            font-size: 1.3rem;
            margin-bottom: 0.5rem;
            animation: slideInUp 0.8s ease-out 0.2s both;
            opacity: 0.95;
        }

        .hero-content .timestamp {
            font-size: 0.95rem;
            margin-bottom: 2rem;
            animation: slideInUp 0.8s ease-out 0.4s both;
            opacity: 0.8;
        }

        .btn-group {
            animation: slideInUp 0.8s ease-out 0.6s both;
        }

        .btn {
            display: inline-block;
            padding: 0.9rem 2.5rem;
            margin: 0.5rem;
            background-color: #667eea;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease, transform 0.3s ease;
            border: none;
            cursor: pointer;
            font-size: 1rem;
            font-weight: 600;
        }

        .btn:hover {
            background-color: #764ba2;
            transform: translateY(-3px);
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
        }

        .btn-secondary {
            background-color: transparent;
            border: 2px solid white;
        }

        .btn-secondary:hover {
            background-color: white;
            color: #667eea;
        }

        .features-section {
            padding: 3rem 0;
            background-color: rgba(255, 255, 255, 0.95);
            margin-top: 2rem;
            border-radius: 10px;
        }

        .section-title {
            text-align: center;
            font-size: 2.5rem;
            color: #333;
            margin-bottom: 3rem;
            font-weight: bold;
        }

        .features {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
            gap: 2rem;
            margin-bottom: 2rem;
        }

        .feature-card {
            background: white;
            padding: 2rem;
            border-radius: 10px;
            box-shadow: 0 3px 10px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s ease, box-shadow 0.3s ease;
            border-left: 4px solid #667eea;
        }

        .feature-card:hover {
            transform: translateY(-8px);
            box-shadow: 0 10px 25px rgba(102, 126, 234, 0.2);
        }

        .feature-icon {
            font-size: 2.5rem;
            color: #667eea;
            margin-bottom: 1rem;
        }

        .feature-card h3 {
            margin-bottom: 0.5rem;
            color: #333;
            font-size: 1.3rem;
        }

        .feature-card p {
            color: #666;
            font-size: 0.95rem;
            line-height: 1.6;
        }

        .user-info {
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            color: white;
            padding: 2rem;
            border-radius: 10px;
            text-align: center;
            margin: 3rem 0;
        }

        .user-info h2 {
            font-size: 1.8rem;
            margin-bottom: 1rem;
        }

        .info-box {
            background-color: rgba(255, 255, 255, 0.1);
            padding: 1.5rem;
            border-radius: 8px;
            margin: 1rem 0;
        }

        footer {
            background-color: rgba(0, 0, 0, 0.85);
            color: white;
            text-align: center;
            padding: 2rem;
            margin-top: 3rem;
        }

        footer p {
            margin: 0.5rem 0;
        }

        footer a {
            color: #667eea;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }

        @keyframes slideInDown {
            from {
                opacity: 0;
                transform: translateY(-30px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @keyframes slideInUp {
            from {
                opacity: 0;
                transform: translateY(30px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @media (max-width: 768px) {
            .hero-content h1 {
                font-size: 2rem;
            }

            .hero-content .subtitle {
                font-size: 1rem;
            }

            nav ul {
                gap: 1rem;
                font-size: 0.85rem;
            }

            .btn {
                padding: 0.7rem 1.5rem;
                font-size: 0.9rem;
            }

            .section-title {
                font-size: 1.8rem;
            }
        }
    </style>
</head>
<body>
    <!-- Header and Navigation -->
    <header>
        <nav>
            <a href="#" class="logo">🚀 SpringBoot App</a>
            <ul>
                <li><a href="#home">Home</a></li>
                <li><a href="#features">Features</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </nav>
    </header>

    <!-- Hero Section -->
    <section class="hero" id="home">
        <div class="container">
            <div class="hero-content">
                <h1>Welcome to SpringBoot</h1>
                <p class="subtitle">Build modern, scalable web applications with ease</p>
                <p class="timestamp">
                    <%= "Current Server Time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMMM dd, yyyy hh:mm:ss a")) %>
                </p>
                <div class="btn-group">
                    <a href="#features" class="btn">Explore Features</a>
                    <a href="#about" class="btn btn-secondary">Learn More</a>
                </div>
            </div>
        </div>
    </section>

    <!-- User Session Information -->
    <%
        String userName = (String) session.getAttribute("userName");
        if (userName == null) {
            userName = "Guest User";
        }
        String sessionId = session.getId();
    %>
    <div class="container">
        <div class="user-info">
            <h2>Welcome, <%= userName %>!</h2>
            <div class="info-box">
                <p><strong>Session ID:</strong> <%= sessionId.substring(0, Math.min(20, sessionId.length())) %>...</p>
                <p><strong>Session Created:</strong> <%= new java.util.Date(session.getCreationTime()) %></p>
                <p><strong>Page Generated:</strong> <%= new java.util.Date() %></p>
            </div>
        </div>
    </div>

    <!-- Features Section -->
    <div class="container">
        <section class="features-section" id="features">
            <h2 class="section-title">Key Features</h2>
            <div class="features">
                <div class="feature-card">
                    <div class="feature-icon">⚡</div>
                    <h3>Lightning Fast</h3>
                    <p>Experience blazing-fast performance with optimized code and industry best practices.</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">🔒</div>
                    <h3>Enterprise Security</h3>
                    <p>Bank-grade security with built-in protections, validations, and encryption.</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">📱</div>
                    <h3>Fully Responsive</h3>
                    <p>Perfect on all devices - desktop, tablet, or mobile with adaptive layouts.</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">🚀</div>
                    <h3>Highly Scalable</h3>
                    <p>Built to grow from startup prototypes to enterprise-level applications.</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">🔧</div>
                    <h3>Easy Integration</h3>
                    <p>Simple integration with popular frameworks, APIs, and third-party services.</p>
                </div>
                <div class="feature-card">
                    <div class="feature-icon">📊</div>
                    <h3>Analytics Ready</h3>
                    <p>Built-in analytics and monitoring for data-driven insights and improvements.</p>
                </div>
            </div>
        </section>
    </div>

    <!-- About Section -->
    <section id="about" class="container" style="margin: 3rem 0; text-align: center;">
        <div class="features-section">
            <h2 class="section-title">About This Application</h2>
            <p style="font-size: 1.1rem; color: #666; line-height: 1.8;">
                This is a modern SpringBoot Dynamic Web Application built with cutting-edge technologies.
                Our platform provides a robust foundation for building scalable, secure, and performant web applications.
                Whether you're building a startup MVP or an enterprise solution, we've got you covered.
            </p>
        </div>
    </section>

    <!-- Footer -->
    <footer id="contact">
        <div class="container">
            <p>&copy; 2026 SpringBoot Dynamic Web Application. All rights reserved.</p>
            <p>Email: <a href="mailto:info@springbootapp.com">info@springbootapp.com</a> | Phone: +1 (555) 123-4567</p>
            <p>Follow us on 
                <a href="#">Twitter</a> | 
                <a href="#">Facebook</a> | 
                <a href="#">LinkedIn</a>
            </p>
        </div>
    </footer>
</body>
</html>