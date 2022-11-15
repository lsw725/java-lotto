package lotto;

import java.util.List;

public interface LottoSystem {
    void askFeeFromUser();
    List<Lotto> purchaseMultipleLotto(Integer payment);
    void showMultipleLotto(List<Lotto> lottos);
    void setNumbersByUser();
    void announceResult(List<Lotto> lottos);
}