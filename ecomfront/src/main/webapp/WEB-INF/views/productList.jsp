<div class="container">
	<div class="row">
		<!-- Side Bar -->
		<div class="col-md-3">
			<%@include file="./common/sidebar.jsp"%>
		</div>
		<!-- Displaying All Products -->
		<div class="col-md-9">
			<div class="row">
				

				<div class="col-lg-12">
				
					<!-- BreadCrumb for All Products -->
				
					<c:if test="${userClickedAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					
					<!-- BreadCrumb for Category Products -->
					
					<c:if test="${userClickedCategoryProducts  == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.catName}</li>
						</ol>
					</c:if>
				
				</div>
			
			</div>
		</div>

	</div>
</div>