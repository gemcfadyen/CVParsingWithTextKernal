# CV Parsing with TextKernal

This repository connects to the TextKernal SOAP API in order to parse a CV.

To use:

- Ensure you have Java8 and Gradle installed, plus an account setup with TextKernal.

- Clone the project
  `git clone git@github.com:gemcfadyen/CVParsingWithTextKernal.git`

- Change into the root directory
  `cd CVParsingWithTextKernal`

- If you need to regenerate the files from the wsdl
 `wsimport -keep -verbose https://home.textkernel.nl/sourcebox/soap/processDocument?wsdl`

  You can read more about this here `http://www.mkyong.com/webservices/jax-ws/jax-ws-hello-world-example/`.


- Create a file under `src/main/resources` called `prod.properties` and ensure the following fields are populated:

```
accountName=<account name from TextKernal>
userName=<user name from TextKernal>
password=<password from TextKernal>
```

This will be required to successfully run the `ClientIntegrationTest`.