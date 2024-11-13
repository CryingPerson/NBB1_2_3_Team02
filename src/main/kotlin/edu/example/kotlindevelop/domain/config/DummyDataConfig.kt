//package edu.example.kotlindevelop.domain.config
//
//import edu.example.kotlindevelop.domain.member.entity.Member
//import edu.example.kotlindevelop.domain.orders.orders.entity.Orders
//import edu.example.kotlindevelop.domain.product.entity.Product
//import jakarta.annotation.PostConstruct
//import org.springframework.context.annotation.Configuration
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing
//
//@Configuration
//@EnableJpaAuditing
//class DummyDataConfig {
//
//    @PostConstruct
//    fun init() {
//        createDummyData()
//    }
//
//    private fun createDummyData() {
//        // 더미 회원 생성
//        val member1 = Member(
//            loginId = "user1",
//            pw = "password1",
//            name = "홍길동",
//            email = "hong@example.com"
//        )
//
//        val member2 = Member(
//            loginId = "user2",
//            pw = "password2",
//            name = "김철수",
//            email = "kim@example.com"
//        )
//
//        // 더미 제품 생성
//        val product1 = Product(
//            name = "노트북",
//            loss = 10000,
//            maker = member1
//        )
//
//        val product2 = Product(
//            name = "스마트폰",
//            loss = 5000,
//            maker = member2
//        )
//
//        // 더미 주문 생성
//        val order1 = Orders(
//            totalPrice = 0L,
//            member = member1
//        )
//        order1.addOrderItem(product1, 1, 1200000)
//        order1.addOrderItem(product2, 2, 800000)
//
//        val order2 = Orders(
//            totalPrice = 0L,
//            member = member2
//        )
//        order2.addOrderItem(product1, 1, 1200000)
//
//        // 데이터베이스에 저장하는 로직 추가 (예: JPA Repository 사용)
//        // 예시: memberRepository.saveAll(listOf(member1, member2))
//        // 예시: productRepository.saveAll(listOf(product1, product2))
//        // 예시: ordersRepository.saveAll(listOf(order1, order2))
//    }
//}