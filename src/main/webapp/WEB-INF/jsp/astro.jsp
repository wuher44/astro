<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page pageEncoding="UTF-8" %>
<html>
<style>
    body {


        background: url("https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/hires/2018/milkyway.jpg") no-repeat center center fixed;
        background-size: 100vw;

        /*background: url("https://media2.giphy.com/media/lZd4oyt1EzC3C/giphy.gif");*/
        align-items: center;
    }

    .mainContainer {

        padding: 10px;
        margin-left: 10px;
        margin-right: 10px; /* auto;*/
        margin-top: 25px;


    }

    .formContainer {
        padding: 20px;
        color: white;
        font-size: 11px;
        font-family: "Times New Roman";
        border: 1px solid lightcoral;
        width: auto;
        /* align-content: center;*/

    }
</style>
<body>
<div class="mainContainer">
    <div class="formContainer" style="background: rgba(5,17,43,0.4)">
        <form method="post" action="/astro" style="margin-top: 10px; margin-left: 10px;">
            <input type="date" name="date" value="${selectedDate}"/>
            <input type="submit" value="Select"><br>
        </form>
    </div>

    <c:if test="${astroD !=null}">
        <h2 style="color: white; text-align: center">
                ${selectedDate}
        </h2>
        <div style="padding: 5px; background-color: rgba(5,17,43,0.4); margin-top: 20px; text-align: center; font-size: 30px; color: white; border: 1px solid lightcoral;">
            <c:forEach var="data" items="${astroD.astroData}">
                <div>
                        ${data.key} : ${data.value}
                </div>
            </c:forEach>
        </div>
    </c:if>
</div>
</body>
</html>