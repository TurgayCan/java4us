<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<!-- head -->
<%@include file="pagePartials/kayit/kayithead.jsp" %>
<link href="<c:url value="/resources/css/pagination.css"/>" rel="stylesheet" type="text/css">
<!-- head -->
<body>
<!-- staticnavmenu -->
<%@include file="pagePartials/staticnavmenu.jsp" %>
<!-- staticnavmenu -->

<!-- subnavmenu -->
<%@include file="pagePartials/subnavmenu.jsp" %>
<!-- subnavmenu -->

<!-- kayitcontent -->
<%@include file="pagePartials/javacontent.jsp" %>
<!-- kayitcontent -->

<!-- footer -->
<%@include file="pagePartials/footer.jsp" %>
<!-- footer -->

</body>

</html>




