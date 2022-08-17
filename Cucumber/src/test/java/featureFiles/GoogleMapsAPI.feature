Feature: Google Maps Place Validations

Scenario: Verify that If the place is being successfully added using AddPlaceAPI
Given Add place payload 
When User calls "AddPlaceAPI" with Post http request method
Then API call success method with statuc code 200
And "status" is Response Body is "OK"
And "scope" in Response Body is "APP"
