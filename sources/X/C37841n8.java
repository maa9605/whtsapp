package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1n8  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37841n8 {
    public static final int A00;
    public static final String A01;
    public static final List A02;

    static {
        List asList;
        A01 = Math.random() < 0.5d ? "wall_time_stack_trace" : "stack_trace";
        A00 = TriggerRegistry.A00.A02("WhatsApp");
        if ("x86_64".equals(AnonymousClass024.A0A())) {
            asList = Arrays.asList("qpl", A01, "other", "system_counters", "high_freq_main_thread_counters");
        } else {
            asList = Arrays.asList("atrace", "qpl", A01, "other", "system_counters", "high_freq_main_thread_counters");
        }
        A02 = asList;
    }
}
