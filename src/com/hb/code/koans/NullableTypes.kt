package com.hb.code.koans

/**
 *
 * Read about null safety and safe calls in Kotlin and rewrite the following
Java code using only one if expression:

public void sendMessageToClient(
@Nullable Client client,
@Nullable String message,
@NotNull Mailer mailer
) {
if (client == null || message == null) return;

PersonalInfo personalInfo = client.getPersonalInfo();
if (personalInfo == null) return;

String email = personalInfo.getEmail();
if (email == null) return;

mailer.sendMessage(email, message);
}

 */
class NullableTypes {

    class PersonalInfo(val email: String)
    class Client(val personalInfo: PersonalInfo)
    interface Mailer {
        fun sendMessage(email: String, message: String);
    }

    fun sendMsgToClient(client: Client?, message: String?, mailer: Mailer) {
        val personalinfo = client?.personalInfo
        val email = personalinfo?.email
        if (email == null || message == null) return
        mailer.sendMessage(email, message)
    }

}