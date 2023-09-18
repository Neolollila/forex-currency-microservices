# forex-currency-microservices

The microservice project consists of three services Currency, Forex and Eureka.

1)Forest Service (FS) is the Service Provider. It provides currency exchange values for various currency.

2)Currency Conversion Service (CCS) can convert a bucket of currencies into another currency. It uses the Forex Service to get current currency exchange values. CCS is the Service Consumer.

3)Also in this project I use Ribbon to distribute load to instances of services.

4)Eureka Naming server I use for registering all microservices.
