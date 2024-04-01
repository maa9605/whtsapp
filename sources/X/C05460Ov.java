package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0Ov */
/* loaded from: classes.dex */
public class C05460Ov {
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a8, code lost:
        throw new java.lang.IllegalArgumentException("bad base-64");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0062, code lost:
        if (r12 != 4) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A00(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05460Ov.A00(java.lang.String):byte[]");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x00b5 -> B:77:0x006f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] A01(byte[] r16) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05460Ov.A01(byte[]):byte[]");
    }

    public String A02(Job job) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(job);
        try {
            return new String(A01(byteArrayOutputStream.toByteArray()), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public Job A03(C2I1 c2i1, boolean z, String str) {
        try {
            return (Job) new ObjectInputStream(new ByteArrayInputStream(A00(str))).readObject();
        } catch (ClassNotFoundException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append("\n");
            sb.append(stringWriter.toString());
            throw new IOException(sb.toString());
        }
    }
}
