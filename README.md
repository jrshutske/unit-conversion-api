# unit-conversion-api

If you need a list of conversions for all the common units of measurement for volume, length, weight, and temperature you can use this to specify what you want to convert and how much. This way app developers don't need to build all of there own conversions by hand, effectively reducing the amount of work and thinking they need to do.

## Use cases
 - Scientific applications where unit conversion is necessary
 - Cooking applications where unit conversion is necessary
 - Used alongside geolocation applications can determine which unit to display to their users

## URI Examples
> /api _enum array of all types of measurement_
```javascript
["volume", "length", "weight", "temperature"]
```

> /api/length _enum array of all units of the given type_
```javascript
["mile", "kilometer", "yard", "meter", "centimeter", "foot", "inch", "millimeter"]
```

> /api/length/mile  _by default the it will convert 1 mile_
```javascript
{
"mile":1.0,
"kilometer":1.609,
"yard":1760.0,
"meter":1609.344,
"centimeter":160934.4,
"foot":5280.0,
"inch":63360.0,
"millimeter":1609000.0
}
```

> /api/length/mile/1337  _accepts custom amount_
```javascript
{
"mile":1337.0,
"kilometer":2151.233,
"yard":2353120.0,
"meter":2151692.928,
"centimeter":2.1516929279999998E8,
"foot":7059360.0,
"inch":8.471232E7,
"millimeter":2.151233E9
}
```

> api/length/mile/9000.1  _amount can be a decimal_
```javascript
{
"mile":9000.1,
"kilometer":14481.1609,
"yard":1.5840176E7,
"meter":1.4484256934400002E7,
"centimeter":1.44842569344E9,
"foot":4.7520528E7,
"inch":5.70246336E8,
"millimeter":1.44811609E10
}
```

>/api/length/millimeter/9.7555e-5  _supports scientific notation_
```javascript
{
"mile":9.695463020509633E-5,
"kilometer":1.56E-4,
"yard":0.17060367454068243,
"meter":0.156,
"centimeter":15.6,
"foot":0.5118110236220472,
"inch":6.141732283464568,
"millimeter":156.0
}
```

## Installing

```
git clone git@github.com:jrshutske/unit-conversion-api.git
```
```
cd unit-conversion-api
```
```
mvn install
```

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The web framework used
* [Heroku](https://heroku.com/) - The cloud application platform used
* [Maven](https://maven.apache.org/) - Dependency management

## Contributing

Please use the [pull_request_template.md](/docs/pull_request_template.md) when submitting a pull request.   
Please update the [timelog.md](/docs/timelog.md) after you get done working.   


## Authors

* **Jack** - [jrshutske](https://github.com/jrshutske)
* **Norm** - [Normando](https://github.com/Normnondo)
* **Ciaran** - [CChapman03](https://github.com/CChapman03)

See also the list of [contributors](https://github.com/jrshutske/unit-conversion-api/graphs/contributors) who participated in this project.

## Acknowledgments

* Madison Area Technical College
* Evening Enterprise Java Class

## Running Locally

Make sure you have Java and Maven installed.  Also, install the [Heroku CLI](https://cli.heroku.com/).

```sh
$ git clone https://github.com/jrshutske/unit-conversion-api.git
$ cd unit-conversion-api
$ mvn install
$ run main
```

Your app should now be running on [localhost:5000](http://localhost:5000/).


## Deploying to Heroku

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

```sh
$ heroku create
$ git push heroku master
$ heroku open
```

## Documentation

For more information about using Java on Heroku, see these Dev Center articles:

- [Java on Heroku](https://devcenter.heroku.com/categories/java)
