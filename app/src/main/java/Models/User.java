package Models;

import lombok.*;
import org.json.JSONObject;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class User implements UserInterface {

    private String alias;
    private String firstName;
    private String lastName;
    private int userId;

    @Override
    public JSONObject serialize() {
        return new JSONObject()
                .put("alias", this.alias)
                .put("firstName", this.firstName)
                .put("lastName", this.lastName)
                .put("userId", this.userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getUserId() == user.getUserId() && Objects.equals(getAlias(), user.getAlias()) && Objects.equals(getFirstName(), user.getFirstName()) && Objects.equals(getLastName(), user.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAlias(), getFirstName(), getLastName(), getUserId());
    }

    @Override
    public String toString() {
        return "User{" +
                "alias='" + alias + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userId=" + userId +
                '}';
    }
}
