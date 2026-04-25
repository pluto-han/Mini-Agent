

package org.example.domain.agent.service.armory.business.data;

import org.example.domain.agent.model.entity.ArmoryCommandEntity;
import org.example.domain.agent.service.armory.factory.DefaultArmoryStrategyFactory;

import java.util.List;

/**
 * 数据加载策略
 *
 * @author Hancong Zhang
 */
public interface ILoadDataStrategy {

    void loadData(ArmoryCommandEntity armoryCommandEntity, DefaultArmoryStrategyFactory.DynamicContext dynamicContext);

}
