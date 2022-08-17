Feature: Search and place the order for products

Scenario: Search experience for product search on both Home page and Offer page
Given Verify user is on GreenKart landing page
When User search with partial name "Tom" and extract actual name of product
Then User searched for the same partial name on the offers page to check if product exist
