db = db.getSiblingDB('town-quiz-db');

db.createCollection('towns');

db.towns.insertMany([
    {
        "id": 1,
        "name": "Berlin",
        "country": "Germany",
        "population": 3669491,
        "area_km2": 891.8,
        "founded": "1237-01-01",
        "coordinates": {
            "latitude": 52.5200,
            "longitude": 13.4050
        },
        "major_languages": ["German"],
        "famous_landmarks": ["Brandenburger Tor", "Reichstag", "Berliner Mauer"],
        "climate": "Temperate",
        "timezone": "CET"
    },
    {
        "id": 2,
        "name": "Paris",
        "country": "France",
        "population": 2161000,
        "area_km2": 105.4,
        "founded": "52-01-01",
        "coordinates": {
            "latitude": 48.8566,
            "longitude": 2.3522
        },
        "major_languages": ["French"],
        "famous_landmarks": ["Eiffelturm", "Louvre", "Notre-Dame"],
        "climate": "Oceanic",
        "timezone": "CET"
    },
    {
        "id": 3,
        "name": "New York",
        "country": "USA",
        "population": 8419600,
        "area_km2": 783.8,
        "founded": "1624-01-01",
        "coordinates": {
            "latitude": 40.7128,
            "longitude": -74.0060
        },
        "major_languages": ["English", "Spanish"],
        "famous_landmarks": ["Statue of Liberty", "Central Park", "Empire State Building"],
        "climate": "Humid Subtropical",
        "timezone": "EST"
    },
    {
        "id": 4,
        "name": "Tokyo",
        "country": "Japan",
        "population": 13929286,
        "area_km2": 2191,
        "founded": "1603-01-01",
        "coordinates": {
            "latitude": 35.6895,
            "longitude": 139.6917
        },
        "major_languages": ["Japanese"],
        "famous_landmarks": ["Tokyo Tower", "Senso-ji", "Shibuya Crossing"],
        "climate": "Humid Subtropical",
        "timezone": "JST"
    },
    {
        "id": 5,
        "name": "Sydney",
        "country": "Australia",
        "population": 5312163,
        "area_km2": 12368,
        "founded": "1788-01-26",
        "coordinates": {
            "latitude": -33.8688,
            "longitude": 151.2093
        },
        "major_languages": ["English"],
        "famous_landmarks": ["Sydney Opera House", "Harbour Bridge", "Bondi Beach"],
        "climate": "Oceanic",
        "timezone": "AEST"
    }
]);
