<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Upload Resume - Job Portal</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">
    <div class="flex items-center justify-center h-screen">
        <div class="bg-white p-8 rounded-2xl shadow-xl w-96 text-center">
            <h1 class="text-2xl font-bold text-gray-800 mb-4">Upload Your Resume</h1>
            
            <form action="UploadServlet" method="post" enctype="multipart/form-data">
                <input type="file" name="resume" class="mb-4" required>
                <br>
                <input type="submit" value="Upload" class="bg-blue-600 hover:bg-blue-700 text-white px-4 py-2 rounded-lg shadow">
            </form>
        </div>
    </div>
</body>
</html>

