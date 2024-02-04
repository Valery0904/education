package Data;

import TestData.UserData;
import io.restassured.http.ContentType;
import io.restassured.specification.Argument;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import java.util.stream.Collectors;
import static io.restassured.RestAssured.given;

public class ReqTest {
    private final static String url = "https://reqres.in/api/users?page=2";

    @Test
    public void checkUserData() {
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(url)
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

        users.forEach(x -> Assert.assertTrue(x.getAvatar().contains("faces")));

        Assert.assertTrue(users.stream().allMatch(x -> x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = users.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = users.stream().map(x -> x.getId().toString()).collect(Collectors.toList());

        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
    }
}
