package java.lang;

import X.C44111yX;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class RunnableEBaseShape7S0100000_I0_7 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableEBaseShape7S0100000_I0_7(C44111yX c44111yX) {
        this.A01 = 1;
        this.A00 = new WeakReference(c44111yX);
    }

    public RunnableEBaseShape7S0100000_I0_7(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:500:0x03e9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 1988
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: java.lang.RunnableEBaseShape7S0100000_I0_7.run():void");
    }
}
