# unit-conversion-api

An api for converting units of measurement, which can easily be deployed to Heroku.

### Installing

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
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please us [pull_request_template.md](/docs/pull_request_template.md) when submitting a pull request.   
Please update [timelog.md](/docs/timelog.md) after you get done working.   


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
