package kotlindevelop.member.exception

class MemberTaskException(message: String?, val statusCode: Int) : RuntimeException(message)