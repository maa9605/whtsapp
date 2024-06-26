package X;

/* renamed from: X.4B5  reason: invalid class name */
/* loaded from: classes3.dex */
public enum C4B5 {
    KEY_CODE_EMPTY(1001, "Your organization key is empty. Please provide a organization key."),
    KEY_CODE_INVALID(1002, "Your organization key is invalid. Please contact your system administrator or UPI support team."),
    PUBLICKEY_NOT_FOUND(1003, "Public key file not found please contact your system administrator UPI support team"),
    PARSER_MISCONFIG(1004, "XML Parser configuration error.Keys.xml may not be formatted correctly."),
    XML_PATH_ERROR(1005, "XML File is not found or cannot be read."),
    KEYS_NOT_VALID(1006, "Keys are not valid. Please contact your system administrator UPI support team"),
    UNKNOWN_ERROR(1007, "Unknown error occurred."),
    TRUST_NOT_VALID(1008, "Trust is not valid");
    
    public final int code;
    public final String description;

    C4B5(int i, String str) {
        this.code = i;
        this.description = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.code);
        sb.append(": ");
        sb.append(this.description);
        return sb.toString();
    }
}
