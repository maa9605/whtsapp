package X;

import android.content.Context;
import com.whatsapp.conversation.ConversationAttachmentContentView;

/* renamed from: X.3JH  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3JH extends AbstractC655337o {
    public int A00;
    public final /* synthetic */ ConversationAttachmentContentView A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3JH(ConversationAttachmentContentView conversationAttachmentContentView, Context context) {
        super(context);
        this.A01 = conversationAttachmentContentView;
    }

    public int getBaseHeightPx() {
        return this.A00;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(1, this.A00 + this.A01.A05);
    }

    public void setBaseHeightPx(int i) {
        this.A00 = i;
    }
}
