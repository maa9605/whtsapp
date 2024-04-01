package X;

import com.whatsapp.Me;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: X.0Ra  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C05970Ra extends ObjectInputStream {
    public C05970Ra(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.ObjectInputStream
    public ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        return readClassDescriptor.getName().equals("com.whatsapp.App$Me") ? ObjectStreamClass.lookup(Me.class) : readClassDescriptor;
    }
}
