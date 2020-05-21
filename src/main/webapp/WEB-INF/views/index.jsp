<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>

<head>
    <title>${title}</title>
</head>

<body>
    <h1>${msg}</h1>
    <h2>Today is
        <fmt:formatDate value="${today}" pattern="yyy-MM-dd" />
    </h2>
</body>

</html>