package tokenGen;

import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.GrantType;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class TokenGenerator {

    public static void main(String[] args) throws OAuthSystemException, OAuthProblemException {
         String clientId = "ae-assets-nonprod";
         String clientSecret = "46dc193e-9b35-4738-bd8c-246eaa7a1409";
         String OauthUrl = "https://sbil-security-cloud-ge4.services-np.pcf.dell.com/auth/oauth/token";
         String finalToken;
         String bearerToken;

         String EncodedValue = getBase64EncodedString(clientId, clientSecret);

        OAuthClient oauthClient = new OAuthClient(new URLConnectionClient());
        OAuthClientRequest request = OAuthClientRequest.tokenLocation(OauthUrl)
                .setGrantType(GrantType.CLIENT_CREDENTIALS).buildBodyMessage();

        request.addHeader("Authorization", "Bearer " + EncodedValue);
        OAuthJSONAccessTokenResponse oAuthResponse = oauthClient.accessToken(request, OAuth.HttpMethod.POST, OAuthJSONAccessTokenResponse.class);
        finalToken = oAuthResponse.getAccessToken();
        bearerToken = "Bearer " + finalToken;
        System.out.println(bearerToken);
    }

    public static String getBase64EncodedString(String id, String password) {

        return Base64.getEncoder().encodeToString((id + ":" + password).getBytes(StandardCharsets.UTF_8));
    }

}
