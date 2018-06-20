# e-commerce
e-commerce product

Write a program that models an e-commerce product:
- Products have name, sale price and market price
- Products may have custom attributes that developers can add attributes to
products without modifying the core database.
- Product attributes can be stored in many types of data (date time, string,
float, integer, text...)
- Products have images, displayed on product detail page (as gallery) and
listing page (using default image)
- A configurable product is a special product that is combination of 2 or more
products with different variations (Ex: color, size... etc).
The code must pass the tests:
1. Create a product with name Iphone X 64Gb Black price $999 (decimal),
market price $1099, 3 images, color Black, storage 64Gb, along with some
specific attributes: description (long text), origin (text), factory date (date
time), weight (float)
2. Create a product with name Iphone X 128Gb Yellow price $950 (decimal),
market price $1050, 3 images, color Yellow, storage 128Gb, along with
some specific attributes: description (long text), origin (text), factory date
(date time), weight (float)
3. Create a configurable product named Iphone X that is combination of the 2
products above.
Notes:
+ You should NOT use a full-featured framework, just plain code.
+ * No database, user interaction or other functionality is required (so no
HTML/CSS/JavaScript); it just needs to be the code which runs and passes
the tests.