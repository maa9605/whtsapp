package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3TC  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3TC {
    public int A00;
    public int A02;
    public String A03;
    public ArrayList A04;
    public final C41451tw A05;
    public final File A06;
    public final List A07 = Arrays.asList("es-AR", "en-AU", "de-AT", "nl-BE", "fr-BE", "pt-BR", "en-CA", "fr-CA", "es-CL", "da-DK", "fi-FI", "fr-FR", "de-DE", "zh-HK", "en-IN", "en-ID", "en-IE", "it-IT", "ja-JP", "ko-KR", "en-MY", "es-MX", "nl-NL", "en-NZ", "no-NO", "zh-CN", "pl-PL", "pt-PT", "en-PH", "ru-RU", "ar-SA", "en-ZA", "es-ES", "sv-SE", "fr-CH", "de-CH", "zh-TW", "tr-TR", "en-GB", "en-US", "es-US");
    public int A01 = 50;

    public C3TC(C001200o c001200o, C41451tw c41451tw, String str) {
        this.A05 = c41451tw;
        this.A03 = str;
        File file = new File(c001200o.A00.getCacheDir(), "Bing");
        this.A06 = file;
        file.mkdirs();
    }
}
