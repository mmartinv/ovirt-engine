package org.ovirt.engine.core.common.queries;

public class MultilevelAdministrationsQueriesParameters extends VdcQueryParametersBase {
    private static final long serialVersionUID = 7435982218559374552L;

    @Override
    public RegisterableQueryReturnDataType GetReturnedDataTypeByVdcQueryType(VdcQueryType queryType) {
        return RegisterableQueryReturnDataType.LIST_IQUERYABLE;
    }

    public MultilevelAdministrationsQueriesParameters() {
    }
}
