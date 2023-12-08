# Carrot-Hole

project construct  
Carrot-Hole/  
├── backend/  
│   ├── src  
│   ├── ...  
├── frontend/  
│   ├── index.html  
│   ├── src/  
│   ├── ...  
│   ├── ... 

frontend toolset：html&&css&js； vue； tailwind；  
frontend feature：water fall lay-out; responsive web page;modern webiste;

//TODO(HakureiR-eimu): how to build the project
## Interface detail

### Input value

```java
@RequestBody Map<String,Object> idMap
```

use map to get the value from front end

```java
idMap.get("userName")
```

### ResultMap

The sealed data type for transferring data to front end

```java
public class ResultMap extends HashMap<String, Object> {

    public static ResultMap create() {
        return new ResultMap();
    }

    public ResultMap setSuccessMsg(String successMsg) {
        this.put("successMsg", successMsg);
        return this;
    }

    public ResultMap setErrorMsg(String errorMsg) {
        this.put("errorMsg", errorMsg);
        return this;
    }

    public ResultMap setSuccess() {
        this.put("isSuccess", "1");
        return this;
    }

    public ResultMap setError() {
        this.put("isSuccess", "0");
        return this;
    }

    public ResultMap setKeyValue(String key, Object value) {
        this.put(key, value);
        return this;
    }
}
```

### AuthController （“/auth”）

1. register

   Input parameter : 

   - userName
   - password

   return :

   - boolean - register success is **true** , otherwise is **false**

2. login

   Input parameter : 

   - userName
   - password

   return :

   - ResultMap
     - User : all user data will be returned
