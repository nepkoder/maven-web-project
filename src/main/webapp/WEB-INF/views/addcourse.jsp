<%-- 
    Document   : addcourse
    Created on : Feb 20, 2018, 1:09:31 PM
    Author     : stim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <%--<%@include file="pageheader.jsp" %>--%>
        <jsp:include  page="pageheader.jsp"/>
       
        
    </head>
    <body class="fixed-nav sticky-footer bg-dark" id="page-top">
        <jsp:include  page="header.jsp"/>
        
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
        <div class="col-9" style="font-size: 1.5em;">
          Add new course
          </div>
      </div> 
    <div class="card card-register mx-auto col-md-9">
      <div class="card-header">New Course Information </div>
     
      <div class="card-body">
          <div class="col-md-9">
          <form action="${pageContext.request.contextPath}/admin/course/add" method="POST">
              <input type="hidden"
             
          <div class="form-group">
            <div class="form-row">
              <label for="inputTitle">Title</label>
              <input class="form-control" name="ctitle" id="inputTitle" type="text" 
                     placeholder="Enter title">
            </div>
          </div>
              
          <div class="form-group">
              <div class="form-row">
            <label for="inputPrice">Price</label>
            <input class="form-control" name="cprice" id="inputPrice" type="text"
                   placeholder="Enter price">
          </div>
          </div>
              
          <div class="form-group">
            <div class="form-row">
             
                <label for="inputDuration">Duration</label>
                <input class="form-control" name="cduration" id="inputDuration" type="text" 
                       placeholder="Enter duration">
              
            </div>
          </div>
            <div class="form-group">
            <div class="form-row">
             <div class="col-md-6">
            <input class="btn btn-block btn-primary" type="submit" value="Save" >
              </div>
                 <div class="col-md-6">
            <input class="btn btn-block btn-warning" type="reset" value="Reset" >
              </div>
            </div>
            </div>
             
            </form>
          </div>
      </div>
    </div>
       
    </div>
       <jsp:include  page="footer.jsp"/>
        </div>
    </body>
</html>

