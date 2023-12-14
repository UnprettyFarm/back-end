//package com.kosta.farm.config.oauth2;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
//import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
//import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.stereotype.Service;
//
//import com.kosta.farm.config.auth.PrincipalDetails;
//import com.kosta.farm.entity.User;
//import com.kosta.farm.repository.UserRepository;
//import com.kosta.farm.util.UserRole;
//
//@Service
//public class PrincipalOauth2UserService extends DefaultOAuth2UserService {
//	@Autowired
//	private UserRepository userRepository;
//	
//	@Autowired
//	private BCryptPasswordEncoder encoder;
//	
//	//userRequest는 code를 받아서 accessToken을 응답받은 객체
//	@Override
//	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
//		OAuth2User oAuth2User = super.loadUser(userRequest);
////	System.out.println("accessToken:"+ userRequest.getAccessToken().getTokenValue());
////	System.out.println("clientRegistration:"+userRequest.getClientRegistration());
////	System.out.println("oAuth2User:"+super.loadUser(userRequest));
//		System.out.println(oAuth2User);
//		System.out.println(oAuth2User.getAttributes());
//		return pricessOAuth2User(userRequest, oAuth2User);
//	}
//	
//	private OAuth2User pricessOAuth2User(OAuth2UserRequest userRequest, OAuth2User oAuth2User) {
//		OAuth2UserInfo oAuth2UserInfo = null;
//		if(userRequest.getClientRegistration().getRegistrationId().equals("naver")) {
//			System.out.println("네이버 로그인 요청");
//			oAuth2UserInfo = new NaverUserInfo(oAuth2User.getAttribute("response"));
//		} else if(userRequest.getClientRegistration().getRegistrationId().equals("kakao")) {
//			System.out.println("카카오 로그인 요청");
//			oAuth2UserInfo = new KakaoUserInfo(oAuth2User.getAttributes());
//		} else {
//			System.out.println("네이버와 카카오만 지원합니다");
//		}
//		
//		System.out.println(oAuth2UserInfo);
//		System.out.println(oAuth2UserInfo.getProvider());
//		System.out.println(oAuth2UserInfo.getProviderId());
//		Optional<User> userOptional = 
//				userRepository.findByProviderAndProviderId(oAuth2UserInfo.getProvider(), oAuth2UserInfo.getProviderId());
//		User user = null;
//		if(userOptional.isPresent()) { //이미 가입되어 있으면 update
//			user = userOptional.get();
//			user.setUserEmail(oAuth2UserInfo.getUserEmail());
//			userRepository.save(user);
//		} else {  //가입되어있지 않으면 insert
//			user = User.builder().userEmail(oAuth2UserInfo.getProvider()+"_"+oAuth2UserInfo.getProviderId())
//				.userEmail(oAuth2UserInfo.getUserEmail())
//				.userRole(UserRole.USER)
//				.provider(oAuth2UserInfo.getProvider())
//				.providerId(oAuth2UserInfo.getProviderId())
//				.build();
//			System.out.println(user);
//			userRepository.save(user);
//		}
//
//		return new PrincipalDetails(user, oAuth2User.getAttributes());
//	}
//}
