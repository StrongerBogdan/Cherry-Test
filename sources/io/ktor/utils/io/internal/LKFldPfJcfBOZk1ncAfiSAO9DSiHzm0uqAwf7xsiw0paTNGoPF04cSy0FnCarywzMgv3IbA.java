package io.ktor.utils.io.internal;

import CzCh11bKXsi2JUI0czy6u2bxV7chpbZv4iVdmzIm9MJSNPtMpTjVOqisSiWg1Uo7ZbonYcCmO708ekSHiD2A88x6J51.D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk;
import CzCh11bKXsi2JUI0czy6u2bxV7chpbZv4iVdmzIm9MJSNPtMpTjVOqisSiWg1Uo7ZbonYcCmO708ekSHiD2A88x6J51.pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jdxzDmFMbg07IjI7PcEPkz1VanpkwzwtfbCexn664xTLWcPT19DMVQM8hDZEAhKtK8Ty4LKyafeJAl8bLKf.PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W;
import jdxzDmFMbg07IjI7PcEPkz1VanpkwzwtfbCexn664xTLWcPT19DMVQM8hDZEAhKtK8Ty4LKyafeJAl8bLKf.XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M;
import kEoBhu4WVmUn9re08c6rLWS0tJV13RSJvMx5LCey4qaBYQi506rUKVXo8JgCj8hKq9tXtBDkKSDjELr8sOJx17ksFYlgHZ7ZtU8WMQz.NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93;
import uFbN2ME9lbpTnqm6T8wOoqVSfn6hfheepFwhy76jCZdmtu0gssmPrT96iP3OFH9qcHDF9uDoxdv1sRZvBLkTkmAN69ecyv7wpA406ahSDN6rq4loK5EAXtjtPIpr4Rs4ihDmz7X02YL1XscFzP1xsVo6e.wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr;
import wQHIhZJqxGpxVvC40dPLgAjr2Ens6.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5;
import yeQgNBzuxw2ebu2Wi0w7CWOQuWbdiUQk5tfB.aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX;

public final class LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA implements pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
    public static final /* synthetic */ AtomicReferenceFieldUpdater xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
    private volatile /* synthetic */ Object jobCancellationHandler = null;
    private volatile /* synthetic */ Object state = null;

    static {
        Class<LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA> cls = LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.class;
        Class<Object> cls2 = Object.class;
        xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "state");
        Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "jobCancellationHandler");
    }

    public static final void P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(LKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W pktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W, Throwable th) {
        while (true) {
            Object obj = lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA.state;
            if (obj instanceof pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) {
                pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1 = (pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) obj;
                if (pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT().Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw) == pktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA, obj, (Object) null)) {
                            LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.VEYmeyCFoRLjkmCxEb3wL7OVAF7pTlbwD8LmwrlOYz0mwEU(obj, "null cannot be cast to non-null type kotlin.coroutines.Continuation<T of io.ktor.utils.io.internal.CancellableReusableContinuation>");
                            pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1.yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(th));
                            return;
                        } else if (atomicReferenceFieldUpdater.get(lKFldPfJcfBOZk1ncAfiSAO9DSiHzm0uqAwf7xsiw0paTNGoPF04cSy0FnCarywzMgv3IbA) != obj) {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final Object DrqQ8C7rtVRDTSclHGsDImq(pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1) {
        while (true) {
            Object obj = this.state;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W pktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W = (PktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W) pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT().Gd4rmBgAATC43rwJVoN1Csd804R32ExEuPACPSEsBTpbQQrsHrDvrrUr3JyAOOlwAD4bO3yhldfKO0QyluiLoLo3520QI2Hfmp68SNEn665ETCz9ieP2d3WoeHtlQXicp2X(XIoAX8Ngr0eP0FzlPvsQCr8abQeqBh68H5a4qv9M.Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw);
                wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr = (wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr) this.jobCancellationHandler;
                if ((wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr != null ? wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 : null) != pktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W) {
                    if (pktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W == null) {
                        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr2 = (wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr) Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.getAndSet(this, (Object) null);
                        if (wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr2 != null) {
                            wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr2.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
                        }
                    } else {
                        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr3 = new wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr(this, pktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W);
                        while (true) {
                            Object obj2 = this.jobCancellationHandler;
                            wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr4 = (wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr) obj2;
                            if (wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr4 != null && wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr4.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 == pktwfYqfDirnUtRXQN2vMKvIDc32F7Ty5nAWT83nNh8W) {
                                wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr3.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
                                break;
                            }
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr3)) {
                                    if (wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr4 != null) {
                                        wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr4.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
                                    }
                                } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                }
                            }
                        }
                    }
                }
                return wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, (Object) null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                }
            }
            if (!(obj instanceof Throwable)) {
                return obj;
            }
            throw ((Throwable) obj);
        }
    }

    public final CzCh11bKXsi2JUI0czy6u2bxV7chpbZv4iVdmzIm9MJSNPtMpTjVOqisSiWg1Uo7ZbonYcCmO708ekSHiD2A88x6J51.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT() {
        CzCh11bKXsi2JUI0czy6u2bxV7chpbZv4iVdmzIm9MJSNPtMpTjVOqisSiWg1Uo7ZbonYcCmO708ekSHiD2A88x6J51.LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5 GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
        Object obj = this.state;
        pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1 = obj instanceof pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1 ? (pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) obj : null;
        return (pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1 == null || (GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT = pnrcnvxizbkf6ep5vexe7zhqnmxyeudpt0ndfsyunilgunjll1.GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT()) == null) ? D8GgZbzcKj5rilKnkj8e7mJ1giKXr7PVzF6Rm3iAMV12GPJFjJsP85ro8B5TqnDd3HSKa30yTfOnQUxiSzoUz76iRkaUnM8auyBFxe5kbLQOgcMjtAdyoJ8gOPES2QZYZSBpUK6Mt0I5HQrX8aYczk.xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9 : GEJ0M5KiUkDTlHAt9gYzjWH5mZj3QywYxE1lC7TUmoCdg776JJFVdWFXRPT;
    }

    public final void YmFIHVAy6MFnHbke10dLWI57IXCp(Throwable th) {
        LeskRE94eW1vHu8OGcwuhyHahztyuvt9XYTevJ1bnM3zifN33NkF21aL5.H0pSch9XQw75sQDNHGRLAUbXt3bOxqOZ(th, "cause");
        yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(th));
        wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr = (wXB0QvqHSWUl8vRXKkBslrNk5URNK8U0eO1KlvjtK4Di22c3qVSzWTiPoK8KpPAIJvk9i3Qm8JFJlcAW8QTbLEiuJz8Cr) Peh2iernJBsMiysuDaEEhSyoW0hY6wz4p5JrcYuartaKXGwf325V19iGs4irf5afpcICDX8gqxpUgk7Tw.getAndSet(this, (Object) null);
        if (wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr != null) {
            wxb0qvqhswul8vrxkkbslrnk5urnk8u0eo1klvjtk4di22c3qvszwtipok8kppaijvk9i3qm8jfjlcaw8qtbleiujz8cr.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d();
        }
    }

    public final void yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(Object obj) {
        Object obj2;
        while (true) {
            Object obj3 = this.state;
            if (obj3 == null) {
                obj2 = NrRzqnkwNu0nnqBOm1PWjgXM1XJmOU4AUNIao5PXqr65iPoidXJXhn2k0kJ93.P6WU5Fb80VNGO5Et4Io8BBRMy5iYWzEMiOWjFQ6aC1H5bM4J2Re3zDKrWeh8bMHmbdtoHUf6AF0k9EVEcdtch1VlBNZCDNBHyq8pJxCnCnBKiHKrl8ianGdd8GWwoH0w5UEx6qiiTrAdRWvKBvkoKS24HXJp2d(obj);
                if (obj2 == null) {
                    aAKmkLbKezAROYGc5DgMGEC4zHADCCehBn6R1gN2o2cyigSvX2gBytKE2kyjHTMJqo9jAEXlE3pUX.Gch8cE0rnMJkANF5GjW4e47SNVyRfzoY7AiD42T3gi64tlksdzRfe3IftjC4onsNQzbkDJATF748HjhGLkN2OxmDTFaLImzAxOR5pAz3cmxJTzZ9m(obj);
                    obj2 = obj;
                }
            } else if (obj3 instanceof pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) {
                obj2 = null;
            } else {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = xLZDBdMW3Qt8sEKsLu9uO5A4afl8X5yqkq9eKmpVYKSmLUGpXoBDJvpLPfckZDn6oT3tMuZNRzv4TNaxBieK1TuGkkKKj9;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, obj2)) {
                    if (obj3 instanceof pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) {
                        ((pnRcNvXIZBKf6Ep5VEXE7zHQNmXYeUdPT0ndFSYuniLGUNJLl1) obj3).yY0Yc5sPaZSYCL0bdTcevx7ABnXkQlKd3EpshlFldxtWb01ZPTjz2XoFnsZBK8oCDGLLaHFtrvKumkvfV0W(obj);
                        return;
                    }
                    return;
                } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                }
            }
        }
    }
}
