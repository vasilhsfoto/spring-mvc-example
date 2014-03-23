<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>

	<h2>
		A global community of tweeters that can simply spit out what they want to say
	</h2>
	
	<h3> Take a look at what our members saying right now...</h3>
	
	<ol class="tweet-list">
		<c:forEach var="tweet" items="${tweets}">
			<li>
				<c:out value="${tweet.username}"></c:out>
				<c:out value="${tweet.password}"></c:out>
			</li>
		</c:forEach>
	</ol>