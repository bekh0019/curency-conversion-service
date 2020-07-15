## Currency Converter Service

Currency Conversion Service (CCS) can convert a bucket of currencies into another currency. 
It uses the Forex Service to get current currency exchange values. CCS is the Service Consumer.
Feign client is used for services communication

An example request and response is shown below:

GET http://localhost:8100/currency-converter/from/EUR/to/INR/quantity/10000

{
  id: 10002,
  from: "EUR",
  to: "INR",
  conversionMultiple: 75,
  quantity: 10000,
  totalCalculatedAmount: 750000,
  port: 8000,
}
![CCS](https://user-images.githubusercontent.com/33734675/87428997-d634ea80-c5eb-11ea-95f2-c016eed1ca26.png)
