
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<%@ include file="pageHeader.jsp" %>--%><!---for-static-webpage--->
    <jsp:include page="pageheader.jsp"></jsp:include>
    <!----used for dynamic webpage---->
</head>
<body class="fixed-nav sticky-footer bg-dark" id="page-top">
<jsp:include page="header.jsp"></jsp:include>

<div class="content-wrapper">
    <div class="container-fluid">
        <!-- Breadcrumbs-->
        <ol class="breadcrumb">
            <li class="breadcrumb-item">
                <a href="">Course</a>
            </li>
            <li class="breadcrumb-item active">Add</li>
        </ol>
        <div class="row">
            
            <div class="container">
                <div class="card card-register mx-auto mt-5">
                    <div class="card-header">Edit Course Information</div>
                    <div class="card-body">
                        <form action="${pageContext.request.contextPath}/admin/course/edit" method="post">
                            <div class="form-group">
                                <label for="exampleInputId">Course Id</label>
                                <input class="form-control" name="cid" id="exampleInputId" type="text" value="${course.id}" readonly>
                            </div>
                            <div class="form-group">
                                <label for="exampleInputTitle">Course Title</label>
                                <input class="form-control" name="ctitle" id="exampleInputTitle" type="text" value="${course.title}">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPrice">Course Price</label>
                                <input class="form-control" name="cprice" id="exampleInputPrice" type="text" value="${course.price}">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputDuration">Course Duration</label>
                                <input class="form-control" name="cduration" id="exampleInputDuration" type="text" value="${course.duration}">
                            </div>
                            <input type="submit" class="btn btn-primary btn-block" value="Change">
                        </form>
                    </div>
                </div>
            </div>
        </div><!---row-close---->
    </div><!---container-fluid-close--->

    <jsp:include page="footer.jsp"></jsp:include>
</div><!---content-wrapper-close---->
</body>
</html>
