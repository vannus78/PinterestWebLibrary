# PinterestWebLibrary
Pinterest web library. Retrieve Pinterest user's boards and pins

This is a simple library written in java 1.8 used to interface with Pinterest site to retrieve user's boards and pins.

Scraping Pinterest pages is difficult because site use the infinite scroll technique to show boards and pins, so this library is written to retrieve informations simulating AJAX calls made by the browser during site visits.

The library makes HTTP calls to pinterest site in AJAX format, analyze JSON results and store informations in java objects.
Actually it can retrieve only boards and pins of a given user, is not possible to find users or check users existence.

Dependencies

<ul>
<li>JDK 1.8</li>
<li>gson 2.6.2 - Google library used to store JSON information into java classes</li>
<li>httpclient-4.5.2 - Apache http client, used to make AJAX calls</li>
<li>httpcore-4.4.4 - Apache http core, supports for http client</li>
</ul>
