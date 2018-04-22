<%-- 
    Document   : adminhome
    Created on : Feb 19, 2018, 12:50:38 PM
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
        
        <div class="content-wrapper">
            <jsp:include  page="header.jsp"/>
        
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      
        <div>
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="">Dashboard</a>
        </li>
        <li class="breadcrumb-item active">Blank Page</li>
      </ol>
        </div>
     
      
      <div class="row">
          <div class="col-md-6">
              <iframe src="https://www.facebook.com/plugins/like.php?href=https%3A%2F%2Fwww.facebook.com%2Fnepkoder&width=450&layout=standard&action=like&size=large&show_faces=true&share=true&height=80&appId" width="450" height="80" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true" allow="encrypted-media"></iframe>
          </div>
          
          <div class="col-md-6">
              <iframe src="https://www.facebook.com/plugins/post.php?href=https%3A%2F%2Fwww.facebook.com%2F20531316728%2Fposts%2F10154009990506729%2F&width=500&show_text=true&height=292&appId" width="500" height="292" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true" allow="encrypted-media"></iframe>
          </div>
      </div>

      
    </div>
       <jsp:include  page="footer.jsp"/>
        </div>
    </body>
</html>
