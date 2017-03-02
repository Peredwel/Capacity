package capacity

import grails.rest.RestfulController
import grails.converters.JSON

class PlaceController extends RestfulController{

    static allowedMethods = ['getPlaceInfo']
    static responseFormats = ['json', 'xml']

    PlaceController() {
        super(Place)
    }

    def index() {

    }

    // Retrieves place data for frontend.
    // If Google ID is new, it must be a new location, therefore
    // generate a new place object.
    def getPlaceInfo() {
        // Begin place retrieval..
        System.out.println('Request for place data recieved.\n')
        def googleID = params.googleID
        def place = Place.find{googleID == googleID}

        // If place exists, retrieve data.
        if(place != null) {
            def jsonPlace = {
                render place as JSON
            }
            System.out.print('Place retrieved.')
            response.status = 200
        }
        // new place, create place object and respond with data
        else {
            System.out.print('New place needs to be created. ')
            place = new Place(googleID: googleID)
            place.save()
            def jsonPlace = {
                render place as JSON
            }
            System.out.print('New place created.\n')
            response.status = 200
        }
    }
}
