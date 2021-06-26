package kodlamaio.northwind.core.utulities.results;

public class ErrorDataResult<T> extends DataResult<T> {
    public ErrorDataResult(T data, boolean success) {
        super(data, success);
    }

    public ErrorDataResult(String message) {
        super(null, false, message);
    }

    public ErrorDataResult(T data) {
        super(data, false);
    }

    public ErrorDataResult() {
        super(null, false);

    }
}
