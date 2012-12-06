<html>
<head>
    <link rel="stylesheet" type="text/css" href="static/css/listings.css">
</head>
<body>
<p><h3> The listings are:</h3></p>

<#list model["allListings"] as listing>
<div class="listing">
    <div class="address">${listing.address}</div>
    <div class="price">$${listing.price}</div>
    <div class="number-of-bedrooms"><span class="numbers">${listing.numberOfBedrooms}</span> bedroom(s), <span class="numbers">${listing.squareFootage}</span> sq. foot</div>
    <div class="contact">Contact: ${listing.contact}</div>
</div>
</#list>

</body>
</html>