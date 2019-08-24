# Marks the progress of the Interactive Maps Application
## Day 1 (29 May 2019)
- [x] Make new space for application in XWiki
- [x] Set up reusable Leaflet code from previous application iteration
- [x] Have a detailed video call with mentor
- [x] Create a PointClass for storing points
- [x] Create a MapClass
- [x] Code for MapSheet for correctly rendering the map from relevant map object data
## Day 2 (30 May 2019)
- [x] Study Solr search query API
- [x] Make required changes to PointClass
- [x] Fix exceptions in rendering the map
- [x] Create a macro #handleMapQuery for processing the data from query
- [x] Get the data in JSON from the #handleMapQuery macro and supply it to javascript
- [x] Visualize data on the map using javascript
## Day 3 (31 May 2019)
- [x] Make a page CommonMacros to include common application macros
- [x] Improve Leaflet jsx code
- [x] Fit the map to point(s) bounds on load
- [x] Submit the work done to mentors. Await mentors' review.
## Day 4 (1 June 2019)
- [x] Code for custom marker icon
- [x] Get the first attachment on a page with PointClass object for marker icon (to be updated)
- [x] Await mentors' review
## Day 5 (2 June 2019)
- [x] Await mentors' review
## Day 6 (3 June 2019)
- [x] Analyze changes suggested by Stephane
- [x] Move all application's classes, templates and sheets to directly under Code space
- [x] Change MapClass's properties defaultZoom (to integer) and query (to textarea)
- [x] Make TemplateProvider for MapTemplate
- [x] Add page title to popup information
- [x] Add livetable for created maps on page Maps.WebHome
## Day 7 (4 June 2019)
- [x] Change MapSheet to neglect pages that are not map items
- [x] Change Leaflet to ignore pages with no location data
- [x] Study Solr Search Application
- [x] Look into Main.SolrSearch and Main.SolrSearchMacros
- [x] Edit solr search results to output JSON
## Day 8 (5 June 2019)
- [x] Extract macros from Main.SolrSearchMacros
- [x] Edit search macros to work for maps
- [x] Display map with search facets
## Day 9 (6 June 2019)
- [x] Make search form visible for default MapSheet
- [ ] Try fixing facet macros not working for MapSheet
- [x] Use #displaySearchFacetValues macro as an alternative to $facetDisplayer
- [x] Code to capture XWiki dom update for changes in facets
- [x] Allow map updates for changes in search and facets
## Day 10 (7 June 2019)
- [x] Make search form and filter widget visible for default MapSheet view
- [x] Custom config for solr search
- [x] Merge pull request from @slauriere for museum maps
- [ ] Do not reload map for changes in filters (currently solr filters reload all page content asynchronously)
## Day 11-12 (8-9 June 2019)
- [ ] Weekend
## Day 13 (10 June 2019)
- [x] Apply theme colors to map and map items (tiles not included)
- [x] Fix icon offset of custom markers
## Day 14 (11 June 2019)
- [x] Thoroughly examine Main.SolrSearch for async jsx code
- [x] Make the map query search asynchronous
## Day 15 (12 June 2019)
- [x] Examine why some museum filters have errors e.g. Germany
- [x] Fix defective mapData json
- [x] Change map item limit (in solr query) from 10 items to 50 items
## Day 16 (13 June 2019)
- [x] Add custom space for popups
- [x] Make popups responsive for easy viewing on small devices
## Day 17 (14 June 2019)
- [x] Add filter controls
- [x] Add support for search type
- [x] Change search form to support both location and item type search
- [x] Remove old search control
## Day 18 (15 June 2019)
- [x] Add list of map results
- [x] Add link to the map item page for each result
- [x] Allow moving to the map item location from search results
- [x] Fix long titles problem in popups
## Day 19 (16 June 2019)
- [ ] Holiday
## Day 20 (17 June 2019)
- [x] Analyze releasenotes application
- [x] Prepare demos and tests
## Day 21 (18 June 2019)
- [x] Examine all POMs and create a new project structure
- [x] Push the new structure and prepare for release
## Day 22 (19 June 2019)
- [x] Analyze code for data importer by Stephane
- [x] Create a generalized data importer with itemLabel, lat, lon as basic fields
- [x] Add support for custom fields by creating a class if required
## Day 23 (20 June 2019)
- [x] Create search control inside map
- [x] Create an overlay panel over map for search and facets
- [x] Move map search, search results and facets into the newly created panel
- [x] Change search type selection layout
- [x] Write required code in velocity, css and js 
## Day 24 (21 June 2019)
- [x] Add fullscreen control
- [x] Optimize jsx code
- [x] Fix test module POMs
## Day 25 (22 June 2019)
- [x] Add UI tests
## Day 26-40 (23 June - 7 July 2019)
- [ ] Final term exams
## Day 41 (8 July 2019)
- [x] Make attachment whose name starts with "marker" as marker icon
- [x] Do not reload map for changes in filters
- [x] Fix facet macros not working for MapSheet ([related forum post](https://forum.xwiki.org/t/including-code-dynamically-from-a-sheet/))
- [x] Preserve map state after async requests reload the content
- [x] Support for map states in URL
## Day 42 (9 July 2019)
- [x] Minor updates and fixes
## Day 43 (10 July 2019)
- [x] Fix facets for preserving map state
- [x] Fix js errors for bad variable name
## Day 44 (11 July 2019)
- [x] Make leaflet controls load faster
- [x] Dynamically updating URL with map state for each necessary action
- [x] Fix facets not keeping the map state
- [x] Update facets URL with map state
- [x] Always show map item results
## Day 45 (12 July 2019)
- [x] Escape fullscreen mode with the escape key
- [x] Add map scale
- [x] Make map size (width and height) configurable
- [x] Support for custom attribution
- [x] Show current location error for insecure context
- [x] Change current location label
- [x] Other improvements and fixes
## Day 46 (13 July 2019)
- [x] Remove dedicated popup area
- [x] Use improved leaflet default small popups for displaying point data
- [x] Other minor fixes
## Day 47 (14 July 2019)
- [x] Shift search control to top left side corner of the map
- [x] Add close button to map search and filter
- [x] Change icon of current location control
- [x] Prepare full application documentation for release
## Day 48 (15 July 2019)
- [x] Try to release the application
- [x] Try fixing git error in release
## Day 49 (16 July 2019)
- [x] Try to release the application
- [x] Fix git error (thanks to Thomas)
- [x] Release again because of accidently releasing two versions
- [x] Import the application on https://extensions.xwiki.org
- [x] Announce the release on XWiki forum and dev mailing list
## Day 50 (17 July 2019)
- [x] Use image macro in documentation
- [x] Add tooltips to leaflet controls
- [x] Separate advanced map options
## Day 51 (18 July 2019)
- [x] Update tests to support new MapSheet
- [x] Add new field in MapClass for custom location properties
- [x] Code for processing custom location property of any class
- [x] Remove doc extra from Maps.WebHome
- [x] Preselect MapTemplate for pages in Maps space
- [x] Remove demo data importer
## Day 52 (19 July 2019)
- [x] Allow options in map configuration for including and configuring facet fields
- [x] Code for custom facet fields
- [x] Use static list for MapClass properties which accept multiple values (customLocationProperties, facetFields)
## Day 53 (20 July 2019)
- [x] Create PathClass for path maps
- [x] Code for processing paths
## Day 54 (21 July 2019)
- [ ] Break
## Day 55 (22 July 2019)
- [x] Update leaflet version to 1.5.1
- [x] Further code for path maps
- [x] Code for processing source and destination to create paths
## Day 56 (23 July 2019)
- [x] Change PointClass to support separate latitude and longitude values
- [x] Change all code the uses PointClass to follow the new structure
- [x] Change all points and maps to use the new PointClass structure
## Day 57 (24 July 2019)
- [ ] Try to implement LocationDescriptionClass to update PointClass using an event listener (dropped because event listener requires programming rights)
- [x] Create Point Editor for creating points using addresses
- [x] Set up preview map for Point Editor
## Day 58 (25 July 2019)
- [x] Set up location search form for Point Editor
- [x] Click anywhere on the map preview to select a location
- [x] Create a point using Point Editor
## Day 59 (26 July 2019)
- [x] Change PathClass to include an array of points rather than just source and destination
- [x] Update code to support a path between a number of points
## Day 60-61 (27-28 July 2019)
- [ ] Weekend
## Day 62 (29 July 2019)
- [x] Update map state for changes in search widget
- [x] Fix go to path's location on map item results
- [x] Ask which approach to user for the ShapeClass options property
## Day 63 (30 July 2019)
- [x] Create a macro for repeating setting popup data and common map item options
- [x] Create ShapeClass
- [x] Implement polyline shape type
## Day 64 (31 July 2019)
- [x] Go to location of shapes from map results
- [x] Implement polygon, rectangle, circle and circle marker shape types
## Day 65 (1 August 2019)
- [x] Full screen for map previews
- [x] Set up shape editor
## Day 66 (2 August 2019)
- [x] Change structure of PointClass to include popup option
- [x] Use GeoJSON for shapes
- [x] Change ShapeClass to support GeoJSON
- [x] Update map data importer for new PointClass structure
- [x] Set up GeoJSON shapes to be included as map items
## Day 67 (3 August 2019)
- [x] Common function for setting up map search in map previews
- [x] Edit points directly on the page with a map preview based PointSheet
- [x] Point Editor as PointSheet for editing and creating points
- [x] Code for PointSheet
- [x] Create PointTemplate and PointTemplateProvider
## Day 68 (4 August 2019)
- [ ] Break
## Day 69 (5 August 2019)
- [x] Shape Editor as ShapeSheet
- [x] Edit shapes directly with a preview
- [x] Map controls as tools for creating shapes using Leaflet.Editable
- [x] Support for creating shapes and saving them as GeoJSON
- [x] Go to GeoJSON shape in map results
- [x] Code optimization
## Day 70 (6 August 2019)
- [ ] Break
## Day 71 (7 August 2019)
- [x] Support for editing shapes with ShapeSheet
- [x] Code optimization
## Day 72 (8 August 2019)
- [ ] Break
## Day 73 (9 August 2019)
- [x] Option to specify custom classes for Points
- [x] Latitude and longitude of points from custom classes
- [x] Save shape's GeoJSON after vertex changed (not just after commiting a shape)
## Day 74 (10 August 2019)
- [x] Process custom point class to create a map item
- [x] Take latitude and longitude of custom classes using property names specified
## Day 75 (11 August 2019)
- [x] Create ShapeTemplateProvider
- [x] Fix velocity error occuring when trying to load shape object with no data
- [x] Set empty GeoJSON for ShapeSheet if there is no shape data
## Day 76 (12 August 2019)
- [x] Improve code for custom point classes
- [x] Fix error in demo map points
- [x] Change latitude and longitude of PointClass from string to double
## Day 77 (13 August 2019)
- [x] Write macro for getting a key value with multiple suffixes
- [x] Make marker draggable when editing a point (PointSheet)
- [x] Rename PointClass popupContent property to content
- [x] Add includePopups option for maps
## Day 78 (14 August 2019)
- [x] Update edit and view modes of PointSheet
- [x] Show map with a point when viewing a Point object (PointSheet)
- [x] Show latitude and longitude fields when editing points
- [x] Allow updating Point location according to custom filled latitude and longitude 
## Day 79 (15 August 2019)
- [x] Rename template providers to include "TemplateProvider" suffix (MapTemplateProvider etc.)
- [x] Update hints of shape and point template providers
- [x] Use terminal pages by default for template providers except MapTemplateProvider
- [x] Create PathSheet, PathTemplate for creating a PathTemplateProvider
- [x] Fix tests failing after updating PointSheet to include latitude and longitude fields
## Day 80 (16 August 2019)
- [x] Update Maps.WebHome to include livetables of Point, Path and Shape objects
- [x] Improve code of PointSheet and ShapeSheet
- [x] Show map with shape when viewing a Shape object (ShapeSheet)
- [x] Add style property to ShapeClass for applying styles to shapes using JSON
## Day 81 (17 August 2019)
- [ ] Break
## Day 82 (18 August 2019)
- [x] Editable options for points
- [x] Update tests to support options for points
- [x] Update style property of shapes
## Day 83 (19 August 2019)
- [x] Add circle support in GeoJSON so that circle shapes can be processed
- [x] Set up webjars for Leaflet.Editable and Path.Drag.js
- [x] Fix error in parsing LeafletUtils jsx
## Day 84 (20 August 2019)
- [x] PointEditor: Place the marker at the searched location
- [x] Fix errors and warnings in console
## Day 85 (21 August 2019)
- [x] Add indoor structures support
- [x] Code for IndoorSheet
- [x] Handle indoor structure as a map item
## Day 86 (22 August 2019)
- [x] Add leaflet-indoor.js as an attachment to LeafletUtils
- [x] Fork and edit leaflet-indoor to support leaflet 1.5.1
- [x] Add necessary options to leaflet-indoor.js so that it works with the application
- [x] Change LeafletUtils code so it works well with the updated leaflet-indoor
- [x] Deploy forked leaflet-indoor on webjars.org
## Day 87 (23 August 2019)
- [x] Move map rendering specific code from LeafletUtils to MapSheet
- [x] Create a new jsx for leaflet libraries so they can be parsed in isolation
- [x] Handle inconsistencies in the name of properties gotten from solr response (get full key name from a short key name to handle suffixes)
- [x] Fix error occuring because of apostrophe in map data
- [x] Fix errors in go to location of some map items
- [x] Full code for map editor
- [x] Easy creation of Points and Shapes using the map editor
## Day 88 (24 August 2019)
- [x] Create template and template provider for indoor structures
- [x] Add support for point in indoor structure items
- [x] Move MapDataImporter as a terminal page
- [x] Hide all code pages
- [x] Remove leaflet-indoor.js from LeafletUtils' attachments and add dependency for leaflet-indoor webjar
---
# Marks the progress of the Interactive Maps Application (Old)
## Day 1 (18 May 2019)
- [x] JavaScript jsx code for a simple map with marker and popup
- [x] Code for creating a new map
- [x] Code for SimpleMapSheet to correctly edit, create and display the map
- [x] Support for xwiki/2.1 syntax in popups
## Day 2 (19 May 2019)
- [x] JavaScript jsx code for the Map Editor
- [x] Code for creating a new map with Map Editor
- [x] Interactive and preview-based creation of map with Map Editor
- [x] Implementation of current location leaflet control (only works for secure connections)
- [x] Implementation of location search leaflet control
- [x] Synchronized and updated styling for the added controls
## Day 3 (20 May 2019)
- [x] Transfer github repository to xwiki-contrib
- [x] Create project design page on design.xwiki.org
- [x] Add description and milestones on XWiki GSoC project page
- [x] Standard and improved style for creation form of SimpleMapSheet
- [ ] Change textarea of popupData to ckeditor in Map Editor - ToDo: Ask community
- [x] Add support for custom marker icon
## Day 4 (21 May 2019)
- [x] Create Map.Maps.WebHome for displaying all created maps
- [x] Minor changes in velocity code for Map Editor
- [x] Create a leaflet-commons module for common leaflet functions
- [x] Change leaflet-map javascript code to support general functions
- [x] Create class for and set up PathMap
- [x] Analyze OSRM to get path between two points
- [x] Get and display path between two points as steps (not smooth)
## Day 5 (22 May 2019)
- [x] Get polyline decode from @mapbox/polyline
- [x] Use decoded polyline geometries from OSRM to generate paths
- [x] Create reverseGeocode to convert latlng to place name using nominatim
- [x] Use reverseGeocode as popup for PathMap source and destination
- [x] Code for creating Path Maps with Map Editor
- [x] jsx for the Path Maps Map Editor
- [x] Combine multiple Map Editors on a single page
## Day 6-7 (23-24 May 2019)
- [x] Add distance and duration to routes of Path Map
- [x] Report the progress to mentors
- [x] Fix encoding issue in xml when formatting files using `mvn xar:format` (thanks to Evalica and Enygma for the fix)
- [x] Start planning for filterable list maps
## Day 8-9 (25-26 May 2019)
- [x] Template providers for creating new maps
- [x] Improve and synchronize the style for leaflet controls
## Day 10 (27 May 2019)
- [x] Create class for filterable list map objects
- [x] Start work on Map Editor for filterable list maps
## Day 11 (28 May 2019)
- [x] Improve filterable list map editor
- [x] Create FilterableListMapSheet and FilterableListMapTemplate
- [x] Handle multiple field forms in FL Map Editor with same name
- [x] Display the data in FilterableListMapSheet for manipulating later
